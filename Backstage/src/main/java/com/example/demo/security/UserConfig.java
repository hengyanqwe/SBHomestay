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
        An byAnNumber = as.ByAnNumber(s);
        if (byAnNumber==null){
            throw new UsernameNotFoundException("用户名不存在");
        }
        String[] list=byAnNumber.getJur().split(",");
        System.out.print("list:");
        List<Jur> sss=new ArrayList();
        String str="";
        for (String l : list)
        {
            System.out.println(l);
            str=l;
            List<Jur> list2=new ArrayList<>();

            for (Jur j:as.ByjurFun(str)){
                sss.add(j);
                if (as.ByjurFun(j.getJurname()).size()<=0)
                {
                    str=l;
                    //break;
                }else{
                    str=j.getJurname();
                }
            }
        }
        System.out.println("byAnNumber:"+byAnNumber);
        return byAnNumber;
    }

}
