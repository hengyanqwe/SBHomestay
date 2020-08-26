package com.example.demo.dao;

import com.example.demo.entity.Collect;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface CollectDao {
    //查询收藏
    @Select("select * from collect")
    List<Collect> query();
    //根据分组查询
    @Select("select * from collect where cgId = #{cgId}")
    List<Collect> cgquery(Integer cgId);
//    取消收藏
    @Delete("delete from collect where collectId = #{collectId}")
    int del(Integer collectId);
//    添加收藏
    @Insert("insert into collect (hmId,userId,cgId) values (#{hmId},#{userId},#{cgId})")
    int addCollect(Collect collect);
}
