package com.example.demo.entity;

public class Hm {
//    房源信息
//    房源信息编号
    Integer hmId;
//    房源地区
    String hmregion;
//    详细地址
    String hmAddress;
//    门牌号
    String hmNumber;
//    房屋类型编号
    Integer hmtypeId;
//    出租类型
    String hmro;
//    房屋户型
    String hmtype;
//    出租面积
    Integer hmRA;
//    卫生间类型
    Integer hmToilet;
//    床铺信息编号
    Integer hmbed;
//    宜居人数
    Integer hmPeople;
//    房源编号
    Integer houseId;
//    类型编号
    Integer htId;

    public Integer getHmId() {
        return hmId;
    }

    public void setHmId(Integer hmId) {
        this.hmId = hmId;
    }

    public String getHmregion() {
        return hmregion;
    }

    public void setHmregion(String hmregion) {
        this.hmregion = hmregion;
    }

    public String getHmAddress() {
        return hmAddress;
    }

    public void setHmAddress(String hmAddress) {
        this.hmAddress = hmAddress;
    }

    public String getHmNumber() {
        return hmNumber;
    }

    public void setHmNumber(String hmNumber) {
        this.hmNumber = hmNumber;
    }

    public Integer getHmtypeId() {
        return hmtypeId;
    }

    public void setHmtypeId(Integer hmtypeId) {
        this.hmtypeId = hmtypeId;
    }

    public String getHmro() {
        return hmro;
    }

    public void setHmro(String hmro) {
        this.hmro = hmro;
    }

    public String getHmtype() {
        return hmtype;
    }

    public void setHmtype(String hmtype) {
        this.hmtype = hmtype;
    }

    public Integer getHmRA() {
        return hmRA;
    }

    public void setHmRA(Integer hmRA) {
        this.hmRA = hmRA;
    }

    public Integer getHmToilet() {
        return hmToilet;
    }

    public void setHmToilet(Integer hmToilet) {
        this.hmToilet = hmToilet;
    }

    public Integer getHmbed() {
        return hmbed;
    }

    public void setHmbed(Integer hmbed) {
        this.hmbed = hmbed;
    }

    public Integer getHmPeople() {
        return hmPeople;
    }

    public void setHmPeople(Integer hmPeople) {
        this.hmPeople = hmPeople;
    }

    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    public Integer getHtId() {
        return htId;
    }

    public void setHtId(Integer htId) {
        this.htId = htId;
    }

    @Override
    public String toString() {
        return "Hm{" +
                "hmId=" + hmId +
                ", hmregion='" + hmregion + '\'' +
                ", hmAddress='" + hmAddress + '\'' +
                ", hmNumber='" + hmNumber + '\'' +
                ", hmtypeId=" + hmtypeId +
                ", hmro='" + hmro + '\'' +
                ", hmtype='" + hmtype + '\'' +
                ", hmRA=" + hmRA +
                ", hmToilet=" + hmToilet +
                ", hmbed=" + hmbed +
                ", hmPeople=" + hmPeople +
                ", houseId=" + houseId +
                ", htId=" + htId +
                '}';
    }
}
