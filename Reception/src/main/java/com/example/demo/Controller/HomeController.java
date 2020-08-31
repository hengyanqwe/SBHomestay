package com.example.demo.Controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@CrossOrigin
@RequestMapping("Home")
public class HomeController {

    @RequestMapping("main")
    public String main(HttpServletRequest request){
        request.setAttribute("name","张三");
        return "/Home.html";
    }

    @RequestMapping("login")
    public String Login(String phone,String password, Model request){
        System.out.println("账号-" + phone + "-密码-" + password);
        request.addAttribute("phone",phone);
        request.addAttribute("password",password);
        return "/Home.html";
    }
}
