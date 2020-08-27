package com.example.demo.security;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Component
public class AuthenticationErrorHandle implements AuthenticationEntryPoint {

    @Override
    public void commence(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException, ServletException {
        System.out.println("commence:"+e);
        // 区分请求方式
        boolean isAjax = false;
        String accept = httpServletRequest.getHeader("Accept");
        String header = httpServletRequest.getHeader("X-Requested-With");
        System.out.println("accept:"+accept);
        System.out.println("header:"+header);
        if(accept.indexOf("application/json")!=-1){
            isAjax = true;
        }else if(header != null && header.indexOf("XMLHttpRequest")!= -1){
            isAjax = true;
        }
        System.out.println(isAjax);
        // aja请求返回错误信息
        // form表单返回登录页面
        if(isAjax){
            httpServletResponse.setCharacterEncoding("UTF-8");
            httpServletResponse.setContentType("application/json");

            PrintWriter writer = httpServletResponse.getWriter();
            writer.print("{\"code\":403,\"message\":\"请先登录\"}");
            writer.flush();
        }else{
            httpServletResponse.sendRedirect("http://localhost:8080/login.html");
        }
    }
}
