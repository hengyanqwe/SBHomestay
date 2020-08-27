package com.example.demo.security;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
//111
@Component
public class PasswordConfig implements PasswordEncoder {

    /**
     * 编码
     *
     * @param charSequence 表单提交的密码
     * @return
     */
    @Override
    public String encode(CharSequence charSequence) {
        return null;
    }

    /**
     * 匹配
     *
     * @param charSequence 表单提交的密码
     * @param s 用户的真实密码
     * @return
     */
    @Override
    public boolean matches(CharSequence charSequence, String s) {
        System.out.println("charSequence:"+charSequence);
        System.out.println("s:"+s);
        return charSequence.toString().equals(s);
    }
}
