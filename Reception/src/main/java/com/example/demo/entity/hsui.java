package com.example.demo.entity;

public class hsui {
    //适宜人群编号
    Integer suiId;
    //房源信息编号
    Integer hmId;

    public hsui() {
        super();
    }

    public Integer getSuiId() {
        return suiId;
    }

    public void setSuiId(Integer suiId) {
        this.suiId = suiId;
    }

    public Integer getHmId() {
        return hmId;
    }

    public void setHmId(Integer hmId) {
        this.hmId = hmId;
    }

    @Override
    public String toString() {
        return "hsui{" +
                "suiId=" + suiId +
                ", hmId=" + hmId +
                '}';
    }
}
