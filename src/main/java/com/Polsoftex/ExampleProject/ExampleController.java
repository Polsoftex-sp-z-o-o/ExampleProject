package com.Polsoftex.ExampleProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    @Autowired
    private CartClient cartClient;

    @GetMapping("/hello")
    public String hello() {
        return "Hello!";
    }

    @GetMapping("/getCart")
    public String getCart() {
        return cartClient.getCart();
    }
}
