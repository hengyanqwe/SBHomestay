package com.example.demo.entity;

import java.sql.Time;

public class cs {
    //聊天编号
    Integer csId;
    //（房东）用户编号
    Integer userId;
    //房源编号
    Integer houseId;
    //屏蔽时间
    Time csDate;
    //屏蔽状态
    Integer csState;
    //用户编号
    Integer userIds;

    public cs() {
        super();
    }

    public Integer getCsId() {
        return csId;
    }

    public void setCsId(Integer csId) {
        this.csId = csId;
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

    public Time getCsDate() {
        return csDate;
    }

    public void setCsDate(Time csDate) {
        this.csDate = csDate;
    }

    public Integer getCsState() {
        return csState;
    }

    public void setCsState(Integer csState) {
        this.csState = csState;
    }

    public Integer getUserIds() {
        return userIds;
    }

    public void setUserIds(Integer userIds) {
        this.userIds = userIds;
    }

    @Override
    public String toString() {
        return "cs{" +
                "csId=" + csId +
                ", userId=" + userId +
                ", houseId=" + houseId +
                ", csDate=" + csDate +
                ", csState=" + csState +
                ", userIds=" + userIds +
                '}';
    }
}
