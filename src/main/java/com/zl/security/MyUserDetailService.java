package com.zl.security;

import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * Copyright (C)，XX
 * FileName: MyUserDetailService
 * Author: zl
 * Date: 2019/6/23  0:07
 * Description: 自定义的UserDetailService
 **/
public class MyUserDetailService implements UserDetailsService {
    /**
     * 读取用户的信息
     * @param s
     * @return
     * @throws UsernameNotFoundException
     * UserDetails  封装用户的接口
     */
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = new User("zl","zl",
                AuthorityUtils.commaSeparatedStringToAuthorityList("ROLE_USER"));
        return user;
    }
}
