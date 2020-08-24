package com.example.demo.entity;

public class fu {
    //常用人编号
    Integer fuId;
    //常用人名称
    String fuName;
    //常用人电话
    Integer fuPhone;
    //常用人身份证
    String fuIcard;
    //用户编号
    Integer userId;

    public fu() {
        super();
    }

    public Integer getFuId() {
        return fuId;
    }

    public void setFuId(Integer fuId) {
        this.fuId = fuId;
    }

    public String getFuName() {
        return fuName;
    }

    public void setFuName(String fuName) {
        this.fuName = fuName;
    }

    public Integer getFuPhone() {
        return fuPhone;
    }

    public void setFuPhone(Integer fuPhone) {
        this.fuPhone = fuPhone;
    }

    public String getFuIcard() {
        return fuIcard;
    }

    public void setFuIcard(String fuIcard) {
        this.fuIcard = fuIcard;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "fu{" +
                "fuId=" + fuId +
                ", fuName='" + fuName + '\'' +
                ", fuPhone=" + fuPhone +
                ", fuIcard='" + fuIcard + '\'' +
                ", userId=" + userId +
                '}';
    }
}
