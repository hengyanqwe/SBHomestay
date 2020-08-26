package com.example.demo.security;

import com.example.demo.entity.An;
import com.example.demo.service.AnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class UserConfig implements UserDetailsService {

    @Autowired
    AnService as;

    /**
     * 根据用户名获取用户信息1111
     * @param s 表单提交的用户名
     * @return 用户详细信息
     * @throws UsernameNotFoundException
     */
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        //根据用户名查询用户信息
        An byAnNumber = as.ByAnNumber(s);
        if (byAnNumber==null){
            throw new UsernameNotFoundException("用户名不存在");
        }
        return byAnNumber;
    }
}
