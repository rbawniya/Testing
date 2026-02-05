package com.example.security.basicSecurity;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class UserController {

    @GetMapping("/users/id/{id}")
    @PreAuthorize("USER")
    public ResponseEntity<?> getUser(@PathVariable("id") int id) {
        return new ResponseEntity<>(id, HttpStatus.OK);
    }

    @GetMapping("/users/get")
    @PreAuthorize("ADMIN")
    public ResponseEntity<?> getUsers() {
        return new ResponseEntity<>(Arrays.asList("1","2"), HttpStatus.OK);
    }
}
