package com.example.demo.controller;

import com.example.demo.dao.PostDao;
import com.example.demo.entity.Post;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("Post")
public class PostController {
    @Resource
    PostDao pd;

    @RequestMapping("query")
    public List<Post> query(){
        List<Post> list = pd.query();
        return list;
    }
}
