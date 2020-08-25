package com.example.demo.dao;

import com.example.demo.entity.Jur;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface JurDao {
    @Select("select * from jur")
    List<Jur> query();
    @Delete("delete  from jur where jurId = #{jurId}")
    int del(@Param("jurId") Integer jurId);
    @Insert("insert into jur (jurName,jurFun,postId) values (#{jurName},#{jurFun},#{postId})")
    int addJur(@Param("jur") Jur jur);
    @Update("update jur set jurName = #{jurName},jurFun = #{jurFun},postId = #{postId} where jurId = #{jurId}")
    int update(@Param("jur") Jur jur);
}
