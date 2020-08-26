package com.example.demo.security;


import org.springframework.stereotype.Component;

@Component
public class PasswordConfig implements org.springframework.security.crypto.password.PasswordEncoder  {
    //编码
    //charSequence:表单提交的密码
    @Override
    public String encode(CharSequence charSequence) {
//        System.out.println("1.输入的密码:"+charSequence.toString());
        return charSequence.toString();
    }
    //匹配
    //用户的真实密码
    @Override
    public boolean matches(CharSequence charSequence, String s) {
//        System.out.println("2.输入的密码:"+charSequence);
//        System.out.println("3.正确的密码:"+s);
        return charSequence.toString().equals(s);
    }
}
