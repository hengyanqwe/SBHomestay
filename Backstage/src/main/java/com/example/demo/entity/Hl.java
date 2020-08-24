package com.example.demo.entity;

public class Hl {
//    房源照片
    //照片编号
    Integer picid;
    //信息编号
    Integer hmid;

    public Integer getPicid() {
        return picid;
    }

    public void setPicid(Integer picid) {
        this.picid = picid;
    }

    public Integer getHmid() {
        return hmid;
    }

    public void setHmid(Integer hmid) {
        this.hmid = hmid;
    }

    @Override
    public String toString() {
        return "Hl{" +
                "picid=" + picid +
                ", hmid=" + hmid +
                '}';
    }
}
