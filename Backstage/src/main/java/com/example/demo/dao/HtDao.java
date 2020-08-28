package com.example.demo.dao;

import com.example.demo.entity.Ht;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface HtDao {
    @Select("select * from ht")
    List<Ht> query();
}
