package com.example.demo.Controller;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@CrossOrigin
@RequestMapping("User")
public class UserController {
    @Resource
    UserDao userDao;

    @RequestMapping("query")
    @ResponseBody
    public List<User> query(){
        List<User> list = userDao.query();
        return list;
    }

    @RequestMapping("phonequery")
    @ResponseBody
    public List<User> phonequery(String userPhone,String userPwd){
        List<User> list = userDao.login(userPhone,userPwd);
        return list;
    }

    @RequestMapping("add")
    @ResponseBody
    public int addUser(User user){
        int i = userDao.addUser(user);
        return i;
    }
}
