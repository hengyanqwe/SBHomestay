package com.example.demo.entity;

public class Hp {
//    房源描述
//    价格规则编号
    Integer hpId;
//    房源价格
    Integer hpprice;
//    交易规则
    String hptr;
//    最少入住天数
    Integer hpmind;
//    最多入住天数
    Integer hpmaxd;
//    房源编号
    Integer houseId;

    public Integer getHpId() {
        return hpId;
    }

    public void setHpId(Integer hpId) {
        this.hpId = hpId;
    }

    public Integer getHpprice() {
        return hpprice;
    }

    public void setHpprice(Integer hpprice) {
        this.hpprice = hpprice;
    }

    public String getHptr() {
        return hptr;
    }

    public void setHptr(String hptr) {
        this.hptr = hptr;
    }

    public Integer getHpmind() {
        return hpmind;
    }

    public void setHpmind(Integer hpmind) {
        this.hpmind = hpmind;
    }

    public Integer getHpmaxd() {
        return hpmaxd;
    }

    public void setHpmaxd(Integer hpmaxd) {
        this.hpmaxd = hpmaxd;
    }

    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    @Override
    public String toString() {
        return "Hp{" +
                "hpId=" + hpId +
                ", hpprice=" + hpprice +
                ", hptr='" + hptr + '\'' +
                ", hpmind=" + hpmind +
                ", hpmaxd=" + hpmaxd +
                ", houseId=" + houseId +
                '}';
    }
}
