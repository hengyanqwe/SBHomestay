package com.example.demo.dao;

import com.example.demo.entity.Hf;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface HfDao {
    @Select("select * from hf")
    List<Hf> query();
}
