package com.example.demo.dao;

import com.example.demo.entity.hd;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface HdDao {
//    查看房源描述
    @Select("select * from hd")
    List<hd> query();
//    根据房源编号查看
    @Select("select * from hd where houseId = #{houseId}")
    List<hd> housequery(Integer houseId);
//    删除
    @Delete("delete from hd where hdId = #{hdId}")
    int del(Integer hdId);
//    添加房源描述
    @Insert("insert into hd (hdTitle,hdDescribe,hdInner,hdTraffic,hd,houseId)")
    int addHd(hd hd);
//    更改
    @Update("update hd set hdTitle = #{hdTitle},hdDescribe = #{hdDescribe},hdInner = #{hdInner}," +
            "hdTraffic = #{hdTraffic},hd = #{hd},houseId = #{houseId} where hdId = #{hdId}")
    int update(hd hd);
}
