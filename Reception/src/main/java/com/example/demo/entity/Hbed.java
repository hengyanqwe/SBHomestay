package com.example.demo.entity;

public class Hbed {
//    床铺类型编号
    Integer bedId;
//    房源类型
    Integer hmId;

    public Integer getBedId() {
        return bedId;
    }

    public void setBedId(Integer bedId) {
        this.bedId = bedId;
    }

    public Integer getHmId() {
        return hmId;
    }

    public void setHmId(Integer hmId) {
        this.hmId = hmId;
    }

    @Override
    public String toString() {
        return "Hbed{" +
                "bedId=" + bedId +
                ", hmId=" + hmId +
                '}';
    }
}
