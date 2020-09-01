package com.example.demo.entity;

public class Bed {
    //类型编号
    Integer bedId;
    //类型名称
    String bedType;
    //信息编号
    Integer hmld;

    public Bed() {
        super();
    }

    public Integer getBedId() {
        return bedId;
    }

    public void setBedId(Integer bedId) {
        this.bedId = bedId;
    }

    public String getBedtype() {
        return bedType;
    }

    public void setBedtype(String bedtype) {
        this.bedType = bedtype;
    }

    public Integer getHmld() {
        return hmld;
    }

    public void setHmld(Integer hmld) {
        this.hmld = hmld;
    }

    @Override
    public String toString() {
        return "Bed{" +
                "bedId=" + bedId +
                ", bedtype='" + bedType + '\'' +
                ", hmld=" + hmld +
                '}';
    }
}
