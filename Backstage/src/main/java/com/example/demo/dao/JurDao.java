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
    @Delete("delete  from jur where jurId = #{param1}")
    int del(@Param("jurid") Integer jurid);
//    添加权限
    @Insert("insert into jur (jurName,jurFun) values (#{jurname},#{jurfun})")
    int addJur(Jur jur);
//    更改权限
    @Update("update jur set jurName = #{jurname} where jurId = #{jurid}")
    int update(Jur jur);
}
