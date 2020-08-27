package com.example.demo.security;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.stereotype.Service;



/**
 * 通过URL地址获取相应权限然后在获取相应的角色集合
 *
 * 需要实现FilterInvocationSecurityMetadataSource接口
 *
 * @author baojulin
 *
 */
@Service("urlService")
public class UrlServiceImpl  implements FilterInvocationSecurityMetadataSource {



    /**
     * 此方法就是通过url地址获取 角色信息的方法
     */
    @Override
    public Collection<ConfigAttribute> getAttributes(Object object) throws IllegalArgumentException {
        // 获取当前的URL地址
        System.out.println("object的类型为:" + object.getClass());
        FilterInvocation filterInvocation = (FilterInvocation) object;
        String url = filterInvocation.getRequestUrl();
        System.out.println("访问的URL地址为(包括参数):" + url);
        url = filterInvocation.getRequest().getServletPath();

            // 如果返回为null则说明此url地址不需要相应的角色就可以访问, 这样Security会放行
            return null;

    }

    @Override
    public Collection<ConfigAttribute> getAllConfigAttributes() {
        // TODO Auto-generated method stub
        return null;
    }

    /**
     * 如果为真则说明支持当前格式类型,才会到上面的 getAttributes 方法中
     */
    @Override
    public boolean supports(Class<?> clazz) {
        // TODO Auto-generated method stub
        // 需要返回true表示支持
        return true;
    }

}
