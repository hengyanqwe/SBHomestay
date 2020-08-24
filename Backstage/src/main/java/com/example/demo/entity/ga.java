package com.example.demo.entity;

public class ga {
    //收款编号
    Integer gaId;
    //收款号码
    String gaIcard;
    //收款类型方式
    Integer gaTypeId;

    public ga() {
        super();
    }

    public Integer getGaId() {
        return gaId;
    }

    public void setGaId(Integer gaId) {
        this.gaId = gaId;
    }

    public String getGaIcard() {
        return gaIcard;
    }

    public void setGaIcard(String gaIcard) {
        this.gaIcard = gaIcard;
    }

    public Integer getTypeId() {
        return gaTypeId;
    }

    public void setTypeId(Integer typeId) {
        this.gaTypeId = typeId;
    }

    @Override
    public String toString() {
        return "ga{" +
                "gaId=" + gaId +
                ", gaIcard='" + gaIcard + '\'' +
                ", typeId=" + gaTypeId +
                '}';
    }
}
