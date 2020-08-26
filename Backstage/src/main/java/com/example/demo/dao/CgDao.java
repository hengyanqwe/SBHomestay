package com.example.demo.dao;

import com.example.demo.entity.Cg;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CgDao {
//    查看收藏分组
    @Select("select * from cg")
    List<Cg> query();
//    删除收藏分组
    @Delete("delete from cg where cgId = #{cgId}")
    int del(Integer cgId);
//    添加收藏分组
    @Insert("insert into cg (cgName,cgMessage) values" +
            "(#{cgName},#{cgMessage})")
    int addCg(Cg cg);
//    更改分组信息
    @Update("update cg set cgName = #{cgName},cgMessage = #{cgMessage} where cgId = #{cgId}")
    int update(Cg cg);
}
