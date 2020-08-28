package com.example.demo.dao;

import com.example.demo.entity.hsui;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface HsuiDao {
    @Select("select * from hsui")
    List<hsui> query();
}
