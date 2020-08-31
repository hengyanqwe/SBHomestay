package com.example.demo.entity;

public class Post {
//    职位
//    职位编号
    Integer postid;
//    职位名称
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
        return "Post{" +
                "postid=" + postid +
                ", postname='" + postname + '\'' +
                '}';
    }
}
