package com.example.demo.dao;

import com.example.demo.entity.Sui;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SuiDao {
    @Select("select * from sui")
    List<Sui> query();
}
