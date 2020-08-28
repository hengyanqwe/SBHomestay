package com.example.demo.dao;

import com.example.demo.entity.An;
import org.apache.ibatis.annotations.*;

import java.util.List;


@Mapper
public interface AnDao extends tk.mybatis.mapper.common.Mapper<An> {

    //测试
    @Select("select * from an where anNumber=#{AnNumber}")
    An ByAnNumber(String AnNumber);
    //查询
    @Select("select a.*,p.* from an a,post p where a.postId=p.postId")
    List<An> query();
    //增加
    @Insert("insert into an values(#{anId},#{anNumber},#{anPassword},#{postId})")
    int add(An an);
    //删除
    @Update("delete from an where anId=#{param1}")
    void del(@Param("anId") Integer anId);
    //修改
    @Update("update an set anPassword=#{anPassword} where anId=#{anId}")
    int update(An an);
}
