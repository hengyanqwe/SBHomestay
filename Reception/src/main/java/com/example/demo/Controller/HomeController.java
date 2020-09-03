package com.example.demo.Controller;

import com.example.demo.dao.AnDao;
import com.example.demo.entity.An;
import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

@Controller
@CrossOrigin
@RequestMapping("Home")
public class HomeController {

    @Resource
    AnDao anDao;

    @RequestMapping("main")
    public String main(Model model){

        return "/Home.html";
    }


    @RequestMapping("login")
    public String Login(String phone,String password, Model model){
        System.out.println("账号-" + phone + "-密码-" + password);
        List<An> res = anDao.login(phone,password);
        System.out.println(res.size());
        if (res.size() == 0){
            model.addAttribute("error" ,"账号或密码错误，请重新登录");
            return "/Home.html";
        } else {
            model.addAttribute("error","正确");
            model.addAttribute("phone",phone);
            model.addAttribute("password",password);
            return "/Home/main";
        }
    }
}
