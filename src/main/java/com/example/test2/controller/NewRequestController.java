package com.example.test2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NewRequestController {
@GetMapping("/")
    public String newRequest() {
return "newRequest";
}
}
