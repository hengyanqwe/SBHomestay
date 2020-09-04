package com.example.demo.entity;

import com.example.demo.dao.AnDao;

import javax.annotation.Resource;
import java.util.Collection;

public class An {
    //账号编号
    Integer anId;
    //账号
    String anNumber;
    //密码
    String anPassword;
    //职员编号i
    Integer postid;
    //职员名称
    String postname;
    //权限
    String  jur;

    public String getJur() {
        return jur;
    }

    public void setJur(String jur) {
        this.jur = jur;
    }

    public An() {}

    public An(String anNumber) {
        this.anNumber = anNumber;
    }

    public Integer getAnId() {
        return anId;
    }

    public void setAnId(Integer anId) {
        this.anId = anId;
    }

    public String getAnNumber() {
        return anNumber;
    }

    public void setAnNumber(String anNumber) {
        this.anNumber = anNumber;
    }

    public String getAnPassword() {
        return anPassword;
    }

    public void setAnPassword(String anPassword) {
        this.anPassword = anPassword;
    }

    public Integer getPostid() {
        return postid;
    }

    public void setPostid(Integer postid) {
        this.postid = postid;
    }

    public String getPostname() {
        return postname;
    }

    public void setPostname(String postname) {
        this.postname = postname;
    }

    @Override
    public String toString() {
        return "An{" +
                "anId=" + anId +
                ", anNumber='" + anNumber + '\'' +
                ", anPassword='" + anPassword + '\'' +
                ", postid=" + postid +
                ", postname='" + postname + '\'' +
                ", jur=" + jur +
                '}';
    }
}
