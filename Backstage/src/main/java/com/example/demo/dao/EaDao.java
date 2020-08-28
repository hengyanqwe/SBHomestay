package com.example.demo.dao;

import com.example.demo.entity.ea;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EaDao {
    @Select("select * from ea")
    List<ea> query();
}
