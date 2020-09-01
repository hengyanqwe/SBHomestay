package com.example.demo.entity;

public class Hf {
//    设施
    //设施编号
    Integer HbrId;
    //设施名字
    Integer brName;

    public Integer getHbrId() {
        return HbrId;
    }

    public void setHbrId(Integer hbrId) {
        HbrId = hbrId;
    }

    public Integer getBrName() {
        return brName;
    }

    public void setBrName(Integer brName) {
        this.brName = brName;
    }

    @Override
    public String toString() {
        return "Hf{" +
                "HbrId=" + HbrId +
                ", brName=" + brName +
                '}';
    }
}
