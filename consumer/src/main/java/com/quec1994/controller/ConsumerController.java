package com.quec1994.controller;

import com.quec1994.service.IHelloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: ConsumerTest
 * <p>Description: 服务消费者控制器类
 *
 * @author quec1994
 * @version V1.0, 2019/4/28
 **/
@RestController
@Slf4j
@RequestMapping("consumer")
public class ConsumerController {

    private IHelloService helloService;

    public ConsumerController(IHelloService helloService) {
        String message = "HelloRemoteService 初始化失败，%s 为 null";
        Assert.notNull(helloService, String.format(message, "helloService"));
        this.helloService = helloService;
    }

    /***
     * 测试接口
     *
     * @return 返回值
     * @author V1.0, quec1994, 2019/4/28 17:15
     **/
    @GetMapping("sayHello")
    public String sayHello() {
        String result = helloService.sayHello("consumer");
        log.info(result);
        return result;
    }

}
