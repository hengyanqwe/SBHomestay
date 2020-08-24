package com.example.demo.entity;

public class An {
    //账号编号
    Integer anId;
    //账号
    String anNumber;
    //密码
    String anPassword;
    //职员编号
    Integer postId;

    public An() {
        super();
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

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    @Override
    public String toString() {
        return "An{" +
                "anId=" + anId +
                ", anNumber='" + anNumber + '\'' +
                ", anPassword='" + anPassword + '\'' +
                ", postId=" + postId +
                '}';
    }
}
