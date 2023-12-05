package com.example.chjava23springweb;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HelloController {


    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello, World";
    }

    @GetMapping("/greeting")
    public String greetSomeone(@RequestParam(required = false) String name) {
        return "hallo" ;
    }
    @GetMapping("/greeting/{name}")
    public String greetName(@RequestParam(required = false) String name) {
        return "hallo" + name;
    }
    @GetMapping("add-something")
    @ResponseStatus(HttpStatus.CREATED)
    public String addSomething(@RequestBody String name) {
        List<String> names = new ArrayList<>();
        names.add(name);
        return name;
    }

}
