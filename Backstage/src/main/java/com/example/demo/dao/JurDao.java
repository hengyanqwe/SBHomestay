package com.example.demo.dao;

import com.example.demo.entity.Jur;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface JurDao {
//    查看权限
    @Select("select * from jur")
    List<Jur> query();
//    删除权限
    @Delete("delete  from jur where jurId = #{jurId}")
    int del(Integer jurId);
//    添加权限
    @Insert("insert into jur (jurName,jurFun,postId) values (#{jurName},#{jurFun},#{postId})")
    int addJur(Jur jur);
//    更改权限
    @Update("update jur set jurName = #{jurName},jurFun = #{jurFun},postId = #{postId} where jurId = #{jurId}")
    int update(Jur jur);
}
