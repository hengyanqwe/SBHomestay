package com.example.demo.entity;

import java.sql.Time;

public class hc {
    //评论编号
    Integer hcId;
    //用户编号
    Integer userId;
    //评论时间
    Time hcDate;
    //评分
    Integer hcGrade;
    //评论内容
    String hcContent;
    //房源信息
    Integer hmId;

    public hc() {
        super();
    }

    public Integer getHcId() {
        return hcId;
    }

    public void setHcId(Integer hcId) {
        this.hcId = hcId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Time getHcDate() {
        return hcDate;
    }

    public void setHcDate(Time hcDate) {
        this.hcDate = hcDate;
    }

    public Integer getHcGrade() {
        return hcGrade;
    }

    public void setHcGrade(Integer hcGrade) {
        this.hcGrade = hcGrade;
    }

    public String getHcContent() {
        return hcContent;
    }

    public void setHcContent(String hcContent) {
        this.hcContent = hcContent;
    }

    public Integer getHmId() {
        return hmId;
    }

    public void setHmId(Integer hmId) {
        this.hmId = hmId;
    }

    @Override
    public String toString() {
        return "hc{" +
                "hcId=" + hcId +
                ", userId=" + userId +
                ", hcDate=" + hcDate +
                ", hcGrade=" + hcGrade +
                ", hcContent='" + hcContent + '\'' +
                ", hmId=" + hmId +
                '}';
    }
}
