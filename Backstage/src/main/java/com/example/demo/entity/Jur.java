package com.example.demo.entity;

public class Jur {
//    权限
//    权限编号
    Integer jurid;
//    权限名称
    String jurname;
//    权限功能
    String jurfun;
//    父级权限编号
    Integer jurFuId;

    public Integer getJurFuId() {
        return jurFuId;
    }

    public void setJurFuId(Integer jurFuId) {
        this.jurFuId = jurFuId;
    }

    public Integer getJurid() {
        return jurid;
    }

    public void setJurid(Integer jurid) {
        this.jurid = jurid;
    }

    public String getJurname() {
        return jurname;
    }

    public void setJurname(String jurname) {
        this.jurname = jurname;
    }

    public String getJurfun() {
        return jurfun;
    }

    public void setJurfun(String jurfun) {
        this.jurfun = jurfun;
    }

    @Override
    public String toString() {
        return "Jur{" +
                "jurid=" + jurid +
                ", jurname='" + jurname + '\'' +
                ", jurfun='" + jurfun + '\'' +
                ", jurFuId=" + jurFuId +
                '}';
    }
}
