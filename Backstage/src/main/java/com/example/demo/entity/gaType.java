package com.example.demo.entity;

public class gaType {
    //收款类型方式编号
    Integer gaTypeId;
    //收款类型方式名称
    String gaTypeName;

    public gaType() {
        super();
    }

    public Integer getGaTypeId() {
        return gaTypeId;
    }

    public void setGaTypeId(Integer gaTypeId) {
        this.gaTypeId = gaTypeId;
    }

    public String getGaTypeName() {
        return gaTypeName;
    }

    public void setGaTypeName(String gaTypeName) {
        this.gaTypeName = gaTypeName;
    }

    @Override
    public String toString() {
        return "gaType{" +
                "gaTypeId=" + gaTypeId +
                ", gaTypeName='" + gaTypeName + '\'' +
                '}';
    }
}
