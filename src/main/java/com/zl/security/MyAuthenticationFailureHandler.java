package com.zl.security;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Copyright (C)，XX
 * FileName: MyAuthenticationFailureHandler
 * Author: zl
 * Date: 2019/6/23  0:39
 * Description: 自定义登陆失败的处理器
 **/
public class MyAuthenticationFailureHandler implements AuthenticationFailureHandler {
    private ObjectMapper objectMapper = new ObjectMapper();
    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException, ServletException {
        //返回json字符串
        Map map = new HashMap();
        map.put("failure", false);
        String json = objectMapper.writeValueAsString(map);
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().write(json);
    }
}
