package com.example.demo.entity;

public class ea {
    //电器编号
    Integer eaId;
    //电器名称
    String eaName;

    public ea() {
        super();
    }

    public Integer getEaId() {
        return eaId;
    }

    public void setEaId(Integer eaId) {
        this.eaId = eaId;
    }

    public String getEaName() {
        return eaName;
    }

    public void setEaName(String eaName) {
        this.eaName = eaName;
    }

    @Override
    public String toString() {
        return "ea{" +
                "eaId=" + eaId +
                ", eaName='" + eaName + '\'' +
                '}';
    }
}
