package com.example.vcTest.restController;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class apiController {

    @RequestMapping(value = "/api/get", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public String getApiTest(){
        return "{\"name\":\"mia\","
                + "\"age\":31,"
                + "\"phone\":\"010-2222-3333\","
                + "\"status\":true"
                + "}";
    }

    @RequestMapping(value = "/api/post", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.OK)
    public String postApiTest(){
        return "{\"result\":\"ok_post\"}";
    }

    @RequestMapping(value = "/api/put", method = RequestMethod.PUT)
    @ResponseStatus(value = HttpStatus.OK)
    public String putApiTest(){
        return "{\"result\":\"ok_put\"}";
    }

}
