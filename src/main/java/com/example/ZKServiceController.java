package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wanganbang on 7/4/16.
 */
@RestController
public class ZKServiceController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getInfo(){
        return "这是一个通过zookeeper注册的服务";
    }
}
