package com.wang.entity;
/**
 * Description 英雄信息实体
 * @Author windpursuer
 * @Date 2017/8/10 18:21
 */
public class HeroDetailEntity {
    /**
     * 主键ID
     */
    private int id;
    /**
     * 英雄名称
     */
    private String heroName;
    /**
     * 英雄头像路径
     */
    private String image;
    /**
     * 英雄属性（见字典表）
     */
    private int property;
    /**
     * 英雄性别（见字典表）
     */
    private int sex;
    /**
     * 英雄价格（见字典表）
     */
    private int price;
    /**
     * 英雄攻击类型（见字典表）
     */
    private int attack_type;
    /**
     * 英雄创建时间
     */
    private String createTime;
    /**
     * 英雄更新时间
     */
    private String updateTime;
    /**
     * 是否删除标记（T：删除 F: 未删除）
     */
    private String isDel;
    /**
     * 英雄是否周免（T：是 F: 否）
     */
    private String isFreeWeek;
    /**
     * 英雄所属分路（见字典表）
     */
    private int wayType;
    /**
     * 英雄能力类别（见字典表）
     */
    private int abilityType;
    /**
     * 英雄别名
     */
    private String heroAlias;


    @Override
    public String toString() {
        return "HeroDetailEntity{" +
                "id=" + id +
                ", heroName='" + heroName + '\'' +
                ", image='" + image + '\'' +
                ", property=" + property +
                ", sex=" + sex +
                ", price=" + price +
                ", attack_type=" + attack_type +
                ", createTime='" + createTime + '\'' +
                ", updateTime='" + updateTime + '\'' +
                ", isDel='" + isDel + '\'' +
                ", isFreeWeek='" + isFreeWeek + '\'' +
                ", wayType=" + wayType +
                ", abilityType=" + abilityType +
                ", heroAlias='" + heroAlias + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getProperty() {
        return property;
    }

    public void setProperty(int property) {
        this.property = property;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAttack_type() {
        return attack_type;
    }

    public void setAttack_type(int attack_type) {
        this.attack_type = attack_type;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getIsDel() {
        return isDel;
    }

    public void setIsDel(String isDel) {
        this.isDel = isDel;
    }

    public String getIsFreeWeek() {
        return isFreeWeek;
    }

    public void setIsFreeWeek(String isFreeWeek) {
        this.isFreeWeek = isFreeWeek;
    }

    public int getWayType() {
        return wayType;
    }

    public void setWayType(int wayType) {
        this.wayType = wayType;
    }

    public int getAbilityType() {
        return abilityType;
    }

    public void setAbilityType(int abilityType) {
        this.abilityType = abilityType;
    }

    public String getHeroAlias() {
        return heroAlias;
    }

    public void setHeroAlias(String heroAlias) {
        this.heroAlias = heroAlias;
    }
}
