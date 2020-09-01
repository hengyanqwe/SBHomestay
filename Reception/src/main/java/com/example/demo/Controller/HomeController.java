package com.example.demo.Controller;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
@CrossOrigin
@RequestMapping("Home")
public class HomeController {

    @RequestMapping("main")
    public String main(HttpServletRequest request){
//        request.setAttribute("name","张三");
        return "/Home.html";
    }

    @RequestMapping("login")
    public String Login(@RequestBody User user, Model request){
        System.out.println("账号-" + user.getUserPhone() + "-密码-" + user.getUserPwd());
//        request.addAttribute("phone",phone);
//        request.addAttribute("password",password);
        return "/Home.html";
    }
    @RequestMapping("main2")
    public String main2(){

        return "/Home2.html";
    }
}
