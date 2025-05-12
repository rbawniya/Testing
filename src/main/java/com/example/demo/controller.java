package com.example.demo;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @Operation(summary = "Get All the APIS", description = "ALL")
    @GetMapping(value = "/get")
    public ResponseEntity<?> get() {
        return new ResponseEntity<>("Hello java", HttpStatus.OK);
    }
}
