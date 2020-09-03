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
import java.util.ArrayList;
import java.util.List;

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
        as.initjurs();
        An byAnNumber = as.ByAnNumber(s);
        if (byAnNumber==null){
            throw new UsernameNotFoundException("用户名不存在");
        }
        String[] list=byAnNumber.getJur().split(",");
        for (String l : list)
        {
            as.jurfun(l);
//            System.out.println(sss);
            /*for (Jur j:as.ByjurFun(str)){
                sss.add(j);
                if (as.ByjurFun(j.getJurname()).size()<=0)
                {
                    str=l;
                    //break;
                }else{
                    str=j.getJurname();
                }
            }*/
        }
        for (Jur j:as.getjurs())
        {
//            System.out.println(j.getJurname()+";"+j.getJurfun());
            byAnNumber.setJur(byAnNumber.getJur()+","+j.getJurfun());
        }
        System.out.println("byAnNumber:"+byAnNumber);
        return byAnNumber;
    }

}
