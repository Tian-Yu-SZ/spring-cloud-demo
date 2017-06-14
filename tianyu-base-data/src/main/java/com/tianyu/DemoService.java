package com.tianyu;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ty on 2017/6/14.
 */

@RestController
public class DemoService {

    @RequestMapping("/hello")
    public String helloService(){
        return "hello world";
    }
}
