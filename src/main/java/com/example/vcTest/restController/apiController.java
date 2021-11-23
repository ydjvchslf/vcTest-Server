package com.example.vcTest.restController;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class apiController {
    
    @RequestMapping(value = "/api/test", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public String getApiTest(){
        //JSON 형식으로 만들어서 return
        return "{\"result\":\"ok_get\"}";
    }

    @RequestMapping(value = "/api/test2", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.OK)
    public String postApiTest2(){
        return "{\"result\":\"ok_post\"}";
    }

    @RequestMapping(value = "/api/test3", method = RequestMethod.PUT)
    @ResponseStatus(value = HttpStatus.OK)
    public String putApiTest3(){
        return "{\"result\":\"ok_put\"}";
    }

}
