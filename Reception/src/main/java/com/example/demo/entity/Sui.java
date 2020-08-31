package com.example.demo.entity;

public class Sui {
//    适宜人群
//    适宜人群编号
    Integer hafId;
//    适宜人群名称
    String hafName;

    public Integer getHafId() {
        return hafId;
    }

    public void setHafId(Integer hafId) {
        this.hafId = hafId;
    }

    public String getHafName() {
        return hafName;
    }

    public void setHafName(String hafName) {
        this.hafName = hafName;
    }

    @Override
    public String toString() {
        return "Sui{" +
                "hafId=" + hafId +
                ", hafName='" + hafName + '\'' +
                '}';
    }
}
