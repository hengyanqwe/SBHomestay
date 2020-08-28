package com.example.demo.dao;

import com.example.demo.entity.Bed;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BedDao {
    @Select("select * from bed")
    List<Bed> query();
    @Select("select * from bed where hmId = #{hmId}")
    List<Bed> hmquery(Integer hmId);
}
