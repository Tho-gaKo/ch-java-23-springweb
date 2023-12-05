package com.example.chjava23springweb;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
public class MessageController {
    List<Message> messages = new ArrayList<>();
    @GetMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public Message addSomething(@RequestBody Message message) {
        messages.add(message);
        return message;
    }

}
