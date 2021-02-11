package com.damla.work.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created By dgurcan on 2/9/2021
 **/
@RestController
public class HelloController {
    @RequestMapping("/")
    public String getHelloWorld(){
        return "Hello Barış";
    }
}
