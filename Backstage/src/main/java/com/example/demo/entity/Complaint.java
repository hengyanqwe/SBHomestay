package com.example.demo.entity;

import java.sql.Date;

public class Complaint {
    //投诉编号
    Integer comId;
    //投诉人
    Integer userId;
    //房源编号
    Integer houseId;
    //投诉日期
    Date comDate;
    //投诉内容
    String comContent;
    //投诉状态
    Integer comState;

    public Integer getComState() {
        return comState;
    }

    public void setComState(Integer comState) {
        this.comState = comState;
    }

    public Complaint() {
        super();
    }

    public Integer getComId() {
        return comId;
    }

    public void setComId(Integer comId) {
        this.comId = comId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    public Date getComDate() {
        return comDate;
    }

    public void setComDate(Date comDate) {
        this.comDate = comDate;
    }

    public String getComContent() {
        return comContent;
    }

    public void setComContent(String comContent) {
        this.comContent = comContent;
    }

    @Override
    public String toString() {
        return "Complaint{" +
                "comId=" + comId +
                ", userId=" + userId +
                ", houseId=" + houseId +
                ", comDate=" + comDate +
                ", comContent='" + comContent + '\'' +
                ", comState=" + comState +
                '}';
    }
}
