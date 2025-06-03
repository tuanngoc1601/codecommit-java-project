package com.deploy.aws.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/")
public class HelloController {

    @GetMapping
    public ResponseEntity<?> greetings() {

        return new ResponseEntity<Object>("<h1 style='color:green;'>Congratulations, your app has been deployed!<h1>", HttpStatus.OK);
    }

}
