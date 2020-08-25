package com.example.demo.dao;

import com.example.demo.entity.Post;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface PostDao {
    @Select("select * from post")
    List<Post> query();
    @Delete("delete from post where postId = #{postId}")
    int del(@Param("postId") Integer postId);
    @Insert("insert into post (postName) values(#{postName})")
    int addPost(@Param("post") Post post);
    @Update("update post set postName = #{post.postName} where postId = #{post.postId}")
    int update(@Param("post") Post post);
}
