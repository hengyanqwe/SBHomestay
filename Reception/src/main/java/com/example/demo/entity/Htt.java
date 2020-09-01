package com.example.demo.entity;

public class Htt {
//    类型编号
    Integer htId;
//    房源编号
    Integer hmId;

    public Integer getHtId() {
        return htId;
    }

    public void setHtId(Integer htId) {
        this.htId = htId;
    }

    public Integer getHmId() {
        return hmId;
    }

    public void setHmId(Integer hmId) {
        this.hmId = hmId;
    }

    @Override
    public String toString() {
        return "Htt{" +
                "htId=" + htId +
                ", hmId=" + hmId +
                '}';
    }
}
