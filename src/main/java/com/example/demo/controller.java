package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @GetMapping(value = "/get")
    public ResponseEntity<?> get() {
        return new ResponseEntity<>("Hello java", HttpStatus.OK);
    }
}
