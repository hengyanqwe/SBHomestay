package com.example.demo.dao;

import com.example.demo.entity.hd;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface HdDao {
    @Select("select * from hd")
    List<hd> query();
    @Select("select * from hd where houseId = #{houseId}")
    List<hd> housequery(Integer houseId);
    @Delete("delete from hd where hdId = #{hdId}")
    int del(@Param("hdId") Integer hdId);
    @Insert("insert into hd (hdTitle,hdDescribe,hdInner,hdTraffic,hd,houseId)")
    int addHd(@Param("hd") hd hd);
    @Update("update hd set hdTitle = #{hdTitle},hdDescribe = #{hdDescribe},hdInner = #{hdInner}," +
            "hdTraffic = #{hdTraffic},hd = #{hd},houseId = #{houseId} where hdId = #{hdId}")
    int update(@Param("hd") hd hd);
}
