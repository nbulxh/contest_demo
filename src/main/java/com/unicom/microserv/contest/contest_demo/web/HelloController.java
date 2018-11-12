package com.unicom.microserv.contest.contest_demo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/liuxh/demo")
public class HelloController {
    @RequestMapping("hello")
    public String hello()
    {
        @RequestParam("name")
        return "Hello World!";
    }
}
