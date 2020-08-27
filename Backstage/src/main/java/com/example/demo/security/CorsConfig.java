package com.example.demo.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import tk.mybatis.mapper.annotation.Order;

import java.util.Arrays;

@Configuration
public class CorsConfig {

    /**
     * 配置跨域过滤器
     * @return
     */
    private CorsConfiguration bulidConfig(){
        // 跨域请求配置对象
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        // 允许请求域名,表示对所有地址都可以访问额
        corsConfiguration.addAllowedOrigin("*");
        //跨域的请求头
        corsConfiguration.addAllowedHeader("*");
        // 跨域的请求方式
        corsConfiguration.addAllowedMethod("*");
        // 允许请求携带验证信息
        corsConfiguration.setAllowCredentials(true);
        // 基于请求路径的跨域解析
        return corsConfiguration;

    }

    @Bean
    public CorsFilter corsFilter(){
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**",bulidConfig());
        return new CorsFilter(source);
    }

}
