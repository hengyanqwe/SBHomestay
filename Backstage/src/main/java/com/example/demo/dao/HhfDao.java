package com.example.demo.dao;

import com.example.demo.entity.Hhf;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface HhfDao {
    @Select("select * from hhf")
    List<Hhf> query();
}
