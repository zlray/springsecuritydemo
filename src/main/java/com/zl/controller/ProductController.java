package com.zl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Copyright (C)，XX
 * FileName: ProductorController
 * Author: zl
 * Date: 2019/6/22  21:37
 * Description: 产品的controller
 **/

@Controller
@RequestMapping("/product")
public class ProductController {
    /**
     * 商品添加
     *
     * @return
     */

    @RequestMapping("/index")
    public String index() {
        return "product/index";
    }

    @RequestMapping("/add")
    public String add() {
        return "product/productAdd";
    }

    @RequestMapping("/update")
    public String update() {
        return "product/productUpdate";
    }

    @RequestMapping("/list")
    public String getList() {
        return "product/productList";
    }

    @RequestMapping("/delete")
    public String delete() {
        return "product/productDelete";
    }




}
