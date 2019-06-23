package com.zl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Copyright (C)，XX
 * FileName: LoginController
 * Author: zl
 * Date: 2019/6/22  23:20
 * Description: 登陆
 **/
@Controller
public class LoginController {

    @RequestMapping("/userLogin")
    public String login() {
        return "login";
    }
    @RequestMapping("/error")
    public String error() {
        return "error";
    }
}
