package ru.kata.spring.boot_security.demo.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.*;


import java.security.Principal;

@RequestMapping("/admin")
@Controller
public class AdminController {
    @GetMapping("/")
    public String showUsers() {
        return "admin";
    }
}
