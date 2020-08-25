package com.example.demo.dao;

import com.example.demo.entity.Post;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface PostDao {
//    查看职位
    @Select("select * from post")
    List<Post> query();
//    删除职位
    @Delete("delete from post where postId = #{postId}")
    int del(@Param("postId") Integer postId);
//    添加职位
    @Insert("insert into post (postName) values(#{postName})")
    int addPost(@Param("post") Post post);
//    更改职位信息
    @Update("update post set postName = #{post.postName} where postId = #{post.postId}")
    int update(@Param("post") Post post);
}
