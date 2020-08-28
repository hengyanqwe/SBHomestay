package com.example.demo.dao;

import com.example.demo.entity.Hl;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface HlDao {
    @Select("select * from hl")
    List<Hl> query();
}
