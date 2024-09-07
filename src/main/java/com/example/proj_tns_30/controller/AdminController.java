package com.example.proj_tns_30.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.proj_tns_30.entity.Admin;
import com.example.proj_tns_30.service.AdminService;

@RestController
public class AdminController {
	
	@Autowired
	public AdminService service;
	
	@PostMapping("/addAdmin")
	//saving the data
	public Admin addAdmin(@RequestBody Admin ad) {
		return service.addAdmin(ad);
	}
	
	@GetMapping("/getAdmin")
	public List<Admin> getAdmin(){
		return service.getAdmin();
	}
	@DeleteMapping("/deleteAdmin/{id}")
	public void deleteAdmin(@PathVariable Long id) {
	    service.deleteAdmin(id);
	}
	@PutMapping("/updateAdmin")
	public Admin updateAdmin(@RequestBody Admin admin) {
	    return service.updateAdmin(admin);
	}

	
}
