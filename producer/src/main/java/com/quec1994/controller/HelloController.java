package com.quec1994.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: HelloController
 * <p>Description: Hello服务控制器
 *
 * @author quec1994
 * @version V1.0, 2019/4/25
 **/
@RestController
@RequestMapping("controller")
public class HelloController {

    /**
     * 测试接口方法
     *
     * @param name 参数
     * @return 返回值
     * @author V1.0, quec1994, 2019/4/28 21:17
     **/
    @GetMapping("/hello")
    public String sayHello(@RequestParam String name) {
        return "hello " + name + "，this is first messge";
    }

}
