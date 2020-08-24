package com.example.demo.controller;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("User")
public class UserController {
    @Resource
    UserDao ud;

    @RequestMapping("query")
    public List<User> query(String annumber,String anpassword){
        List<User> list = ud.query(annumber, anpassword);
        return list;
    }
}
