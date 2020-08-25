package com.example.demo.dao;

import com.example.demo.entity.Hp;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface HpDao {
    @Select("select * from hp")
    List<Hp> query();
    @Select("select * from hp where houseId = #{houseId")
    List<Hp> hpquery(Integer houseId);
    @Delete("delete from hp where hpId = #{hpId}")
    int del(@Param("hpId") Integer hpId);
    @Insert("insert into hp (hpPrice,hpTr,hpMind,hpMaxd,houseId) values" +
            "(#{hpPrice},#{hpTr},#{hpMind},#{hpMaxd},#{houseId})")
    int addHp(@Param("hp") Hp hp);
    @Update("update hp set hpPrice = #{hpPrice},hpTr = #{hpTr},hpMind = #{hpMind},hpMaxd = #{hpMaxd},houseId = #{houseId}" +
            "where hpId = #{hpId}")
    int update(@Param("hp") Hp hp);
}
