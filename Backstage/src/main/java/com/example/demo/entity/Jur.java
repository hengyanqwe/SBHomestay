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
    Integer jurfuid;

    public Jur(Integer jurid, String jurname, String jurfun, Integer jurfuid) {
        this.jurid = jurid;
        this.jurname = jurname;
        this.jurfun = jurfun;
        this.jurfuid = jurfuid;
    }

    public Jur() {
    }

    @Override
    public String toString() {
        return "Jur{" +
                "jurid=" + jurid +
                ", jurname='" + jurname + '\'' +
                ", jurfun='" + jurfun + '\'' +
                ", jurfuid=" + jurfuid +
                '}';
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

    public Integer getJurfuid() {
        return jurfuid;
    }

    public void setJurfuid(Integer jurfuid) {
        this.jurfuid = jurfuid;
    }
}
