package com.lxz.test.thymeleaf_simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2019/9/23.
 * User: lizhen 767072965@qq.com
 * Date: 2019/9/23
 * Time: 16:08
 * Version: thymeleaf_simple 1.0.0.0
 * [功能描述].
 */
@Controller
public class TestController {


    @RequestMapping("/test")
    public String test(){

        return "test";
    }

}
