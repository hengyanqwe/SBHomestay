package com.example.demo.entity;

import java.sql.Time;

public class complaint {
    Integer comId;
    Integer userId;
    Integer houseId;
    Time comDate;
    String comContent;

    public complaint() {
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

    public Time getComDate() {
        return comDate;
    }

    public void setComDate(Time comDate) {
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
        return "complaint{" +
                "comId=" + comId +
                ", userId=" + userId +
                ", houseId=" + houseId +
                ", comDate=" + comDate +
                ", comContent='" + comContent + '\'' +
                '}';
    }
}
