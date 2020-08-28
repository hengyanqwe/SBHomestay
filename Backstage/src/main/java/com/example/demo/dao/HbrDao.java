package com.example.demo.dao;

import com.example.demo.entity.hbr;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface HbrDao {
    @Select("select * from hbr")
    List<hbr> query();
}
