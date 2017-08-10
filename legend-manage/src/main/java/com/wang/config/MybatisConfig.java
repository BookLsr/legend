package com.wang.config;


import org.apache.ibatis.io.VFS;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.boot.autoconfigure.SpringBootVFS;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.TransactionManagementConfigurer;

import javax.sql.DataSource;

/**
 * Description Mybatis配置类
 * @Author windpursuer
 * @Date 2017/8/10 15:00
 */
@Configuration
//加上这个注解，使得支持事务
@EnableTransactionManagement
public class MybatisConfig implements TransactionManagementConfigurer {
    private Logger logger = LoggerFactory.getLogger(DataSourceConfig.class);

    @Autowired
    private DataSource dataSource;

    @Value("${mybatis.typeAliasesPackage}")
    private String typeAliasesPackage;
    @Value("${mybatis.mapperLocations}")
    private String mapperLocations;
    /**
     * Description 获取sqlSessionFactory
     * @Author windpursuer
     * @Date 2017/8/10 17:09
     */
    @Bean(name = "sqlSessionFactory")
    public SqlSessionFactory sqlsessionFactoryBean() {
        //DefaultVFS在获取jar上存在问题，使用springBoot只能修改
        VFS.addImplClass(SpringBootVFS.class);
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        sqlSessionFactoryBean.setTypeAliasesPackage(typeAliasesPackage);
        //添加XML目录
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        try {
            sqlSessionFactoryBean.setMapperLocations(resolver.getResources(mapperLocations));
            return sqlSessionFactoryBean.getObject();
        } catch (Exception e) {
            logger.error("获取sqlSessionFactory失败，原因：【{}】", e.getMessage());
            throw new RuntimeException("sqlSessionFactory init fail", e);
        }
    }

    /**
     * Description 用于实际查询的sql工具,传统dao开发形式可以使用这个,基于mapper代理则不需要注入
     * @Author windpursuer
     * @Date 2017/8/10 17:09
     */
    @Bean(name = "sqlSessionTemplate")
    public SqlSessionTemplate sqlSessionTemplate(@Qualifier("sqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
        return new SqlSessionTemplate(sqlSessionFactory);
    }

    /**
     * 事务管理,具体使用在service层加入@Transactional注解
     */
    @Bean(name = "transactionManager")
    @Override
    public PlatformTransactionManager annotationDrivenTransactionManager() {
        return new DataSourceTransactionManager(dataSource);
    }

}
