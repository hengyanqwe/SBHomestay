package com.example.demo.dao;

import com.example.demo.entity.Hm;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface HmDao {
//    查看房源信息
    @Select("select * from hm")
    List<Hm> query();
//    根据房源编号查看
    @Select("select * from hm where houseId = #{houseId}")
    List<Hm> housequery(Integer houseId);
//    根据类型编号查看
    @Select("select * from hm where htId =#{htId}")
    List<Hm> htquery(Integer htId);
//    （下架）删除房源
    @Delete("delete from hm where hmId = #{hmId}")
    int del(Integer hmId);
//    添加房源信息
    @Insert("insert into hm (hmRegion,hmAddress,hmNumber,hmtypeId,hmRo,hmToilet,hmBed,hmPeople,houseId,htId) values" +
            "(#{hmRegion},#{hmAddress},#{hmNumber},#{hmtypeId},#{hmtypeId},#{hmRo},#{hmToilet},#{hmBed},#{hmPeople},#{houseId},#{htId})")
    int addHm(Hm hm);
//    更改
    @Update("update hm set hmRegion = #{hmRegion},hmAddress = #{hmAddress},hmNumber = #{hmNumber},hmtypeId = #{hmtypeId}," +
            "hmRo = #{hmRo},hmToilet = #{hmToilet},hmBed = #{hmBed},hmPeople = #{hmPeople},houseId = #{houseId},htId = #{htId}" +
            "where hmId = #{hmId}")
    int update(Hm hm);
}
