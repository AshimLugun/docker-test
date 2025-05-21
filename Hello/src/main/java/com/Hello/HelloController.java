package com.Hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/message")
    public String getMessage(){
        return "Ashim Hiras Praful Lugun";
    }
}
