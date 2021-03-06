package com.fortinosandoval.igclone.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("home")
public class HomeController {
    @GetMapping
    public ResponseEntity<String> register() {
        HttpHeaders responseHeaders = new HttpHeaders();
        return new ResponseEntity<>("bodybody", responseHeaders, HttpStatus.OK);
    }
}