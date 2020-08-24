package com.example.demo.dao;

import com.example.demo.entity.Post;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface PostDao {
    @Select("select * from post")
    public List<Post> query();
}
