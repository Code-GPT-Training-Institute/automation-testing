package com.codegpt.training.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleRestController {

    @RequestMapping(method = RequestMethod.GET, path = "/isAlive")
    public String isAlive() {
        return "I am alive......";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/sayHello")
    public String sayHello() {
        return "Hello....";
    }
}

