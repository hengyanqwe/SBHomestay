package com.example.demo.dao;

import com.example.demo.entity.Reply;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ReplyDao {
    @Select("select * from reply")
    List<Reply> query();
}
