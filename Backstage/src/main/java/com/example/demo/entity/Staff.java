package com.example.demo.entity;

public class Staff {
//    职员
//    职员编号
    Integer staffid;
//    职员名称
    String staffname;
//    职位编号
    Integer postid;

    public Integer getStaffid() {
        return staffid;
    }

    public void setStaffid(Integer staffid) {
        this.staffid = staffid;
    }

    public String getStaffname() {
        return staffname;
    }

    public void setStaffname(String staffname) {
        this.staffname = staffname;
    }

    public Integer getPostid() {
        return postid;
    }

    public void setPostid(Integer postid) {
        this.postid = postid;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "staffid=" + staffid +
                ", staffname='" + staffname + '\'' +
                ", postid=" + postid +
                '}';
    }
}
