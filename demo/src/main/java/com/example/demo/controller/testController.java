package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 终于白发始于青丝
 * @create 2022-05-19 14:42
 * @Version 1.0
 * @ClassName testController
 * @Description 类方法说明：
 */
@RestController
public class testController {
    @GetMapping("/demo")
    public String demo() {
        return "demo";
    }
}
