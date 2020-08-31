package com.example.demo.entity;

public class Br {
    //卫浴编号
    Integer brId;
    //卫浴名称
    String brName;

    public Br() {
        super();
    }

    public Integer getHbrId() {
        return brId;
    }

    public void setHbrId(Integer hbrId) {
        this.brId = hbrId;
    }

    public String getBrName() {
        return brName;
    }

    public void setBrName(String brName) {
        this.brName = brName;
    }

    @Override
    public String toString() {
        return "br{" +
                "hbrId=" + brId +
                ", brName='" + brName + '\'' +
                '}';
    }
}
