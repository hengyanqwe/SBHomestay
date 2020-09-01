package com.example.demo.entity;

import java.util.Date;

public class Special {
//    特殊价格
//    特殊价格编号
    Integer specialId;
//    特殊价格
    Integer specialprice;
//    特殊价格日期
    Date specialDate;
//    房源编号
    Integer houseId;
//    禁止入住状态
    Integer specialStop;

    public Integer getSpecialId() {
        return specialId;
    }

    public void setSpecialId(Integer specialId) {
        this.specialId = specialId;
    }

    public Integer getSpecialprice() {
        return specialprice;
    }

    public void setSpecialprice(Integer specialprice) {
        this.specialprice = specialprice;
    }

    public Date getSpecialDate() {
        return specialDate;
    }

    public void setSpecialDate(Date specialDate) {
        this.specialDate = specialDate;
    }

    public Integer getHouseId() {
        return houseId;
    }

    public void setHouseId(Integer houseId) {
        this.houseId = houseId;
    }

    public Integer getSpecialStop() {
        return specialStop;
    }

    public void setSpecialStop(Integer specialStop) {
        this.specialStop = specialStop;
    }

    @Override
    public String toString() {
        return "Special{" +
                "specialId=" + specialId +
                ", specialprice=" + specialprice +
                ", specialDate=" + specialDate +
                ", houseId=" + houseId +
                ", specialStop=" + specialStop +
                '}';
    }
}
