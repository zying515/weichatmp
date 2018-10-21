package com.wx.wechatmp.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/wxin")
public class WechatMpEntrceControl {
    @RequestMapping("/hello")
    public String hello() {
        return "hello,this is a springboot demo";
    }
    @RequestMapping("/test")
    public String test() {
        return "hello,this is a springboot demo";
    }
}
