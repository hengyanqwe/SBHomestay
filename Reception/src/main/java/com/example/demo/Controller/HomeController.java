package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
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
    public String Login(HttpServletRequest request,String phone,String password){
        request.setAttribute("phone",phone);
        request.setAttribute("password",password);
        System.out.println("账号-" + phone + "-密码-" + password);
        return "/Home.html";
    }
    @RequestMapping("main2")
    public String main2(){

        return "/Home2.html";
    }
}
