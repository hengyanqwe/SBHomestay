package com.example.demo.entity;

public class hea {
    //电器编号
    Integer eaId;
    //房源信息
    Integer hmId;

    public hea() {
        super();
    }

    public Integer getEaId() {
        return eaId;
    }

    public void setEaId(Integer eaId) {
        this.eaId = eaId;
    }

    public Integer getHmId() {
        return hmId;
    }

    public void setHmId(Integer hmId) {
        this.hmId = hmId;
    }

    @Override
    public String toString() {
        return "hea{" +
                "eaId=" + eaId +
                ", hmId=" + hmId +
                '}';
    }
}
