package com.example.demo.entity;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

public class An implements UserDetails {
    //账号编号
    Integer anId;
    //账号
    String anNumber;
    //密码
    String anPassword;
    //职员编号
    Integer postId;

    public An() {}

    public An(String anNumber) {
        this.anNumber = anNumber;
    }

    public Integer getAnId() {
        return anId;
    }

    public void setAnId(Integer anId) {
        this.anId = anId;
    }

    public String getAnNumber() {
        return anNumber;
    }

    public void setAnNumber(String anNumber) {
        this.anNumber = anNumber;
    }

    public String getAnPassword() {
        return anPassword;
    }

    public void setAnPassword(String anPassword) {
        this.anPassword = anPassword;
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    @Override
    public String toString() {
        return "An{" +
                "anId=" + anId +
                ", anNumber='" + anNumber + '\'' +
                ", anPassword='" + anPassword + '\'' +
                ", postId=" + postId +
                '}';
    }

    //获取授权信息(权限)
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }
    //获取用户密码
    @Override
    public String getPassword() {
        return this.anPassword;
    }
    //获取用户账号
    @Override
    public String getUsername() {
        return anNumber;
    }
    //当前账户是否过期
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }
    //当前账户是否被锁定
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }
    //当前账户认证是否过期
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }
    //当前账户是否禁用
    @Override
    public boolean isEnabled() {
        return true;
    }
}
