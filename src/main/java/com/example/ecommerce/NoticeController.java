package com.example.ecommerce;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NoticeController {
    @GetMapping("/all")
    String getAll() {
        return "Rohit";
    }
    @PostMapping("/add/users")
    String add() {
        return "Rohit";
    }
}
