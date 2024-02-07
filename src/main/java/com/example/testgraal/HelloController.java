package com.example.testgraal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private final TwilioProperties twilioProperties;

    @Autowired
    public HelloController(TwilioProperties twilioProperties) {
        this.twilioProperties = twilioProperties;
    }

    @GetMapping("/hello")
    String sayHello() {
        return "Hello " + twilioProperties.username();
    }
}
