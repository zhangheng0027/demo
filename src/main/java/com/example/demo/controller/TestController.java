package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zh on 2018/11/27.
 */
@RestController
public class TestController {

    @RequestMapping("test")
    public String teset() {
        return "success";
    }

}
