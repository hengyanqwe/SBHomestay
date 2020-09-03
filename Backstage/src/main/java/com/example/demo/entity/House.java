package com.example.demo.entity;

public class House {
//    房源
//    房源编号
    Integer houseId;
//    （房东）用户编号
    Integer userId;
//    房东名称
    String userName;
//    房源状态
    Integer houseState;
//    房源地区
    String hmRegion;
    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getHouseState() {
        return houseState;
    }

    public void setHouseState(Integer houseState) {
        this.houseState = houseState;
    }

    public String getHmRegion() {
        return hmRegion;
    }

    public void setHmRegion(String hmRegion) {
        this.hmRegion = hmRegion;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "House{" +
                "houseId=" + houseId +
                ", userId=" + userId +
                ", userName='" + userName + '\'' +
                ", houseState=" + houseState +
                ", hmRegion='" + hmRegion + '\'' +
                '}';
    }
}
