package com.quec1994.service.remote;

import com.quec1994.service.IHelloService;
import com.quec1994.utils.Constants;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.web.client.RestTemplate;

/**
 * ClassName: HelloRemoteService
 * <p>Description: 远程调用hello服务
 *
 * @author quec1994
 * @version V1.0, 2019/4/25
 **/
@Service
public class HelloRemoteService implements IHelloService {

    /***
     * 远程服务
     **/
    private static final String REMOTE_CONTROLLER = Constants.PRODUCER + "controller/";

    private RestTemplate restTemplate;

    public HelloRemoteService(RestTemplate restTemplate) {
        String message = "HelloRemoteService 初始化失败，%s 为 null";
        Assert.notNull(restTemplate, String.format(message, "restTemplate"));
        this.restTemplate = restTemplate;
    }

    /**
     * 测试
     *
     * @param name 参数
     * @return 返回值
     * @author V1.0, quec1994, 2019/4/28 17:29
     **/
    @Override
    public String sayHello(String name) {
        return restTemplate.getForObject(REMOTE_CONTROLLER + "hello?name=" + name, String.class);
    }

}
