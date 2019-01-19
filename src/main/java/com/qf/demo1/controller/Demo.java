package com.qf.demo1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author xl
 * @Date 2019/1/19
 */
@Controller
@RequestMapping("demo")
public class Demo {

    @RequestMapping("/hello")
    public void hello(){
        System.out.println("hello,everyone!");
    }
}
