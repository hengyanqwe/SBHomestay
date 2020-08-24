package com.example.demo.entity;

public class Collect {
    //收藏编号
    Integer collectId;
    //房源编号
    Integer hmId;
    //用户编号
    Integer userIds;
    //分组编号
    Integer cdId;

    public Collect() {
        super();
    }

    public Integer getCollectId() {
        return collectId;
    }

    public void setCollectId(Integer collectId) {
        this.collectId = collectId;
    }

    public Integer getHmId() {
        return hmId;
    }

    public void setHmId(Integer hmId) {
        this.hmId = hmId;
    }

    public Integer getUserIds() {
        return userIds;
    }

    public void setUserIds(Integer userIds) {
        this.userIds = userIds;
    }

    public Integer getCdId() {
        return cdId;
    }

    public void setCdId(Integer cdId) {
        this.cdId = cdId;
    }

    @Override
    public String toString() {
        return "Collect{" +
                "collectId=" + collectId +
                ", hmId=" + hmId +
                ", userIds=" + userIds +
                ", cdId=" + cdId +
                '}';
    }
}
