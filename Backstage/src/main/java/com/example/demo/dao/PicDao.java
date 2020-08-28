package com.example.demo.dao;

import com.example.demo.entity.Pic;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PicDao {
    @Select("select * from pic")
    List<Pic> query();
}
