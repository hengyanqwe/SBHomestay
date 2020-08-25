package com.example.demo.controller;

import com.example.demo.dao.PostDao;
import com.example.demo.entity.Post;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("Post")
public class PostController {
    @Resource
    PostDao pd;

    @RequestMapping("query")
    @ResponseBody
    public List<Post> query(){
        List<Post> list = pd.query();
        System.out.println(list);
        return list;
    }

    @RequestMapping("add")
    @ResponseBody
    public int addPost(Post post){
        int i = pd.addPost(post);
        return i;
    }

    @RequestMapping("del")
    @ResponseBody
    public int del(Integer postId){
        int i = pd.del(postId);
        return i;
    }

    @RequestMapping("update")
    @ResponseBody
    public int update(Post post){
        int i = pd.update(post);
        return i;
    }
}
