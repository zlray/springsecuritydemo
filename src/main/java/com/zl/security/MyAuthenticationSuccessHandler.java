package com.zl.security;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Copyright (C)，XX
 * FileName: MyAuthenticationSuccessHandler
 * Author: zl
 * Date: 2019/6/23  0:24
 * Description: 自定义登陆成功的处理器
 **/
public class MyAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

    //    jackson框架的工具类,转换一个对象为json字符串
    private ObjectMapper objectMapper = new ObjectMapper();

    /**
     * @param request
     * @param response
     * @param authentication 代表认值成功后的信息
     * @throws IOException
     * @throws ServletException
     */
    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {
        //返回json字符串
        Map map = new HashMap();
        map.put("success", true);
        String json = objectMapper.writeValueAsString(map);
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().write(json);

    }
}
