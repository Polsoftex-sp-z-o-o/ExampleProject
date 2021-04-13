package com.Polsoftex.ExampleProject;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.UUID;

//TODO: A real address
@FeignClient(name = "ExampleProject2", url = "exampleproject2:8080")
public interface CartClient {

    @GetMapping("/cart")
    String getCart();
}
