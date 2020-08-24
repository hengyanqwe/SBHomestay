package com.example.demo.entity;

public class Ht {
//    房屋类型
//    类型编号
    Integer htId;
//    类型名称
    String htName;
//    信息编号
    Integer hmId;

    public Integer getHtId() {
        return htId;
    }

    public void setHtId(Integer htId) {
        this.htId = htId;
    }

    public String getHtName() {
        return htName;
    }

    public void setHtName(String htName) {
        this.htName = htName;
    }

    public Integer getHmId() {
        return hmId;
    }

    public void setHmId(Integer hmId) {
        this.hmId = hmId;
    }

    @Override
    public String toString() {
        return "Ht{" +
                "htId=" + htId +
                ", htName='" + htName + '\'' +
                ", hmId=" + hmId +
                '}';
    }
}
