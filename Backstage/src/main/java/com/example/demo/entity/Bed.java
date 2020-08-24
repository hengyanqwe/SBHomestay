package com.example.demo.entity;

public class Bed {
    Integer bedId;
    String bedtype;
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
        return bedtype;
    }

    public void setBedtype(String bedtype) {
        this.bedtype = bedtype;
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
                ", bedtype='" + bedtype + '\'' +
                ", hmld=" + hmld +
                '}';
    }
}
