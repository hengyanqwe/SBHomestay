package com.example.demo.Controller;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Controller
@CrossOrigin
@RequestMapping("Home")
public class HomeController {

    @Resource
    UserDao userDao;

    @RequestMapping("/main")
    public String main(){
        return "/Home.html";
    }

    @RequestMapping("/login")
    public String Login(String userPhone,String userPwd, Model model){
        System.out.println("账号-" + userPhone + "-密码-" + userPwd);
        List<User> res = userDao.login(userPhone,userPwd);
        if (res.size() == 0){
            return "Home";
        } else {
            model.addAttribute("error","正确");
            model.addAttribute("phone",userPhone);
            model.addAttribute("password",userPwd);
            return "Home";
        }
    }

    @RequestMapping("toregister")
    public String toRegister(Model model){
        return "/register.html";
    }

}
