package com.example.demo.dao;

import com.example.demo.entity.House;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface HouseDao {
    @Select("select * from house")
    List<House> query();
}
