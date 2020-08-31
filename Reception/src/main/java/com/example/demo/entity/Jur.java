package com.example.demo.entity;

public class Jur {
//    权限
//    权限编号
    Integer jurid;
//    权限名称
    String jurname;
//    权限功能
    String jurfun;
//    职位编号
    Integer postid;

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

    public Integer getPostid() {
        return postid;
    }

    public void setPostid(Integer postid) {
        this.postid = postid;
    }

    @Override
    public String toString() {
        return "Jur{" +
                "jurid=" + jurid +
                ", jurname='" + jurname + '\'' +
                ", jurfun='" + jurfun + '\'' +
                ", postid=" + postid +
                '}';
    }
}
