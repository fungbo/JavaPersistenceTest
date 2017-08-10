package com.tw;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;


    @GetMapping("/add")
    public String hello() {
        helloService.doAllThings();
        return "add";
    }

    @GetMapping("/remove")
    public String remove() {
        helloService.remove();
        return "remove";
    }
}
