package com.example.demo.dao;

import com.example.demo.entity.hc;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface HcDao {
    @Select("select * from hc")
    List<hc> query();
}
