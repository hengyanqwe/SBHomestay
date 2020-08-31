package com.example.demo.security;




import com.example.demo.dao.AnDao;
import com.example.demo.entity.An;
import com.example.demo.entity.Jur;
import com.example.demo.service.AnService;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class UserConfig implements UserDetailsService {
    @Resource
    AnService as;

    /**
     * 根据用户名获取用户信息
     *
     * @param s 表单提交的用户名
     * @return 用户详细信息
     * @throws UsernameNotFoundException
     */
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
      /*  String s1="";
        System.out.println(ad.query());
        List<Jur> byquery = ad.Byquery(s);
        for (int i=0;i<byquery.size();i++){
            Jur jur = byquery.get(i);
            s+=jur.getJurfun();
        }
        System.out.println(s);*/


        An byAnNumber = as.ByAnNumber(s);
        if (byAnNumber==null){
            throw new UsernameNotFoundException("用户名不存在");
        }
        System.out.println("byAnNumber:"+byAnNumber);
        return byAnNumber;
    }

}
