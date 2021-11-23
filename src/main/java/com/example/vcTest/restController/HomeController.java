package com.example.vcTest.restController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping(value = "/")
    public String index(){
        return "Hello This is Mia Index!";
    }

}
