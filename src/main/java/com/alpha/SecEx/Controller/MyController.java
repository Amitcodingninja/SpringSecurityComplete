package com.alpha.SecEx.Controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("/greet")
    public String greet(HttpServletRequest request) {
        return "Hello Amit " + request.getSession().getId();
    }
}
