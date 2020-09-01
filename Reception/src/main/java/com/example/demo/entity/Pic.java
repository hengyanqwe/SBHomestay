package com.example.demo.entity;

public class Pic {
//    照片
//    照片编号
    Integer postid;
//    照片链接
    String postname;

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
        return "Pic{" +
                "postid=" + postid +
                ", postname='" + postname + '\'' +
                '}';
    }
}
