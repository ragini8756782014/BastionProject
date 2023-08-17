package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entity.crmentity.OnlineActivation;
import com.example.demo.entity.crmentity.User;
import com.example.demo.service.BastionService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class BastionController {

	    @Autowired
		private BastionService bastionService;
		
	    @GetMapping("b/gelAllData")
	    @PreAuthorize("hasAuthority('ADMIN')")
		public ResponseEntity<?> getAllBookingDetails(){
			return new ResponseEntity<>(bastionService.getAll(), HttpStatus.OK);
		}
	
	    @PostMapping("b/newUser")
	    @PreAuthorize("hasAuthority('ADMIN')")
	    public String addUser(@RequestBody User user){
	    	return bastionService.addUser(user);
	    }
	    
	    @DeleteMapping("b/deleteEntry/{license_key}")
	    @PreAuthorize("hasAuthority('ADMIN')")
		public Void deleteEntry(@PathVariable("license_key") String license_key){
			 bastionService.deleteEntry(license_key);
			 return null;
		}
	    
	    @GetMapping("b/getById/{id}")
	    @PreAuthorize("hasAuthority('ADMIN')")
	    public OnlineActivation getById(@PathVariable("license_key") String license_key){
	     return bastionService.getById(license_key);
	    }
	    
	    @PutMapping("b/update/{license_key}")
	    @PreAuthorize("hasAuthority('ADMIN')")
	    public OnlineActivation UpdateSystemCount(@PathVariable("license_key") String license_key)
	    {
	    	return bastionService.updateSystemCount(license_key);
	    }
}
