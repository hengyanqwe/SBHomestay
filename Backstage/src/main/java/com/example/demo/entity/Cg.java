package com.example.demo.entity;

public class Cg {
    //分组编号
    Integer cgId;
    //分组名称
    String cgName;
    //分组信息
    String cgMessage;

    public Cg() {
        super();
    }

    public Integer getCgId() {
        return cgId;
    }

    public void setCgId(Integer cgId) {
        this.cgId = cgId;
    }

    public String getCgName() {
        return cgName;
    }

    public void setCgName(String cgName) {
        this.cgName = cgName;
    }

    public String getCgMessage() {
        return cgMessage;
    }

    public void setCgMessage(String cgMessage) {
        this.cgMessage = cgMessage;
    }

    @Override
    public String toString() {
        return "Cg{" +
                "cgId=" + cgId +
                ", cgName='" + cgName + '\'' +
                ", cgMessage='" + cgMessage + '\'' +
                '}';
    }
}
