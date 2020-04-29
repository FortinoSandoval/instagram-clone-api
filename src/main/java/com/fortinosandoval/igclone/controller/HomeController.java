package com.fortinosandoval.igclone.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("home")
public class HomeController {
    @GetMapping
    public String register() {
        return "hola!!!!";
    }
}