package com.example.demo.controller;

import com.example.demo.service.BastionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private BastionService bastionService;

    @GetMapping("b/gelAllDevelopers")
    public ResponseEntity<?> getAllBookingDetails(){
        return new ResponseEntity<>(bastionService.getAlldeveloper(), HttpStatus.OK);
    }

}
