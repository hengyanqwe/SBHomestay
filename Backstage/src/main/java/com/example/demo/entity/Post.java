package com.example.demo.entity;

public class Post {
//    职位
//    职位编号
    Integer postid;
//    职位名称
    String postname;
    //角色说明
    String description;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Post{" +
                "postid=" + postid +
                ", postname='" + postname + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
