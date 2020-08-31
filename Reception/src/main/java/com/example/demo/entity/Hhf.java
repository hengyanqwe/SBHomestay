package com.example.demo.entity;

public class Hhf {
//    房源设施
    //设施编号
    Integer hbrId;
    //信息编号
    Integer brName;

    public Integer getHbrId() {
        return hbrId;
    }

    public void setHbrId(Integer hbrId) {
        this.hbrId = hbrId;
    }

    public Integer getBrName() {
        return brName;
    }

    public void setBrName(Integer brName) {
        this.brName = brName;
    }

    @Override
    public String toString() {
        return "Hhf{" +
                "hbrId=" + hbrId +
                ", brName=" + brName +
                '}';
    }
}
