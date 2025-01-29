package com.github.danat;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class DanatController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, Danat!";
    }

    @PostMapping("/echo")
    public String echoMessage(@RequestBody String message) {
        return "You said: " + message;
    }
}