package com.example.demo.entity;

public class hbr {
    //卫浴编号
    Integer brId;
    //房源信息编号
    Integer hmId;

    public hbr() {
        super();
    }

    public Integer getBrId() {
        return brId;
    }

    public void setBrId(Integer brId) {
        this.brId = brId;
    }

    public Integer getHmId() {
        return hmId;
    }

    public void setHmId(Integer hmId) {
        this.hmId = hmId;
    }

    @Override
    public String toString() {
        return "hbr{" +
                "brId=" + brId +
                ", hmId=" + hmId +
                '}';
    }
}
