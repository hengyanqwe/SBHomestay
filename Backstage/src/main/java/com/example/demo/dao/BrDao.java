package com.example.demo.dao;

import com.example.demo.entity.Br;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BrDao {
    @Select("select * from br")
    List<Br> query();
}
