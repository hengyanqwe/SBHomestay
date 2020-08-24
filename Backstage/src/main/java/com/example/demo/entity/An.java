package com.example.demo.entity;

public class An {
    Integer anid;
    String annumber;
    String anpassword;
    Integer postid;

    public An() {
        super();
    }

    public Integer getAnid() {
        return anid;
    }

    public void setAnid(Integer anid) {
        this.anid = anid;
    }

    public String getAnnumber() {
        return annumber;
    }

    public void setAnnumber(String annumber) {
        this.annumber = annumber;
    }

    public String getAnpassword() {
        return anpassword;
    }

    public void setAnpassword(String anpassword) {
        this.anpassword = anpassword;
    }

    public Integer getPostid() {
        return postid;
    }

    public void setPostid(Integer postid) {
        this.postid = postid;
    }

    @Override
    public String toString() {
        return "User{" +
                "anid=" + anid +
                ", annumber='" + annumber + '\'' +
                ", anpassword='" + anpassword + '\'' +
                ", postid=" + postid +
                '}';
    }
}
