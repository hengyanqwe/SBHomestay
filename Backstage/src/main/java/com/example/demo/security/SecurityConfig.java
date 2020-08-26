package com.example.demo.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import javax.annotation.Resource;


//将当前作为配置类
@Configuration
//使用security
@EnableWebSecurity
//启用方法注解权限
@EnableGlobalMethodSecurity(securedEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //使用form表单登录
        http.formLogin()
                //登录界面
                .loginPage("/login.html")
                //登录的form的表单路径
                .loginProcessingUrl("/login-check")
                //默认成功路径：登录后有目标资源，访问目标资源，没有跳转默认成功路径
                .defaultSuccessUrl("/home.html  ")
                //认证失败后跳转的路径
                .failureForwardUrl("/An/failure")
                //用户名对应的表单属性
                //表单提交的密码参数名称
                .usernameParameter("anNumber")
                .passwordParameter("anPassWord")
                //直接访问
                .permitAll()
                .and()
                //授权请求：设置请求的拦截情况
                .authorizeRequests()
                //任意请求
                .anyRequest()
                //认证
                .authenticated()
                .and()
                //跨域请求
                .csrf()
                //禁用
                .disable();
    }

    @Resource
    PasswordConfig passwordConfig;
    @Resource
    UserConfig userConfig;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
        DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
        //密码的编码规则
        //new BCryptPasswordEncoder():数据中保存的密码是加密后的密码
        daoAuthenticationProvider.setPasswordEncoder(passwordConfig);
        //用户信息的获取方式
        daoAuthenticationProvider.setUserDetailsService(userConfig);

        auth.authenticationProvider(daoAuthenticationProvider);
    }
}
