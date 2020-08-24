package com.example.demo.entity;

public class House {
//    房源
//    房源编号
    Integer houseId;
//    （房东）用户编号
    Integer userId;

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

    @Override
    public String toString() {
        return "House{" +
                "houseId=" + houseId +
                ", userId=" + userId +
                '}';
    }
}
