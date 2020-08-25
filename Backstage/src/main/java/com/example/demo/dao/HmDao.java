package com.example.demo.dao;

import com.example.demo.entity.Hm;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface HmDao {
    @Select("select * from hm")
    List<Hm> query();
    @Select("select * from hm where houseId = #{houseId}")
    List<Hm> housequery(Integer houseId);
    @Select("select * from hm where htId =#{htId}")
    List<Hm> htquery(Integer htId);
    @Delete("delete from hm where hmId = #{hmId}")
    int del(@Param("hmId") Integer hmId);
    @Insert("insert into hm (hmRegion,hmAddress,hmNumber,hmtypeId,hmRo,hmToilet,hmBed,hmPeople,houseId,htId) values" +
            "(#{hmRegion},#{hmAddress},#{hmNumber},#{hmtypeId},#{hmtypeId},#{hmRo},#{hmToilet},#{hmBed},#{hmPeople},#{houseId},#{htId})")
    int addHm(@Param("hm") Hm hm);
    @Update("update hm set hmRegion = #{hmRegion},hmAddress = #{hmAddress},hmNumber = #{hmNumber},hmtypeId = #{hmtypeId}," +
            "hmRo = #{hmRo},hmToilet = #{hmToilet},hmBed = #{hmBed},hmPeople = #{hmPeople},houseId = #{houseId},htId = #{htId}" +
            "where hmId = #{hmId}")
    int update(@Param("hm") Hm hm);
}
