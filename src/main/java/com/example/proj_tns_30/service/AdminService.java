package com.example.proj_tns_30.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.proj_tns_30.entity.Admin;
import com.example.proj_tns_30.repository.Adminrepo;

@Service
public class AdminService {
	
	@Autowired
	private Adminrepo arepo;

	// Add Admin details
	public Admin addAdmin(Admin ad){
		return arepo.save(ad);
	}

	// Get all Admin details
	public List<Admin> getAdmin() {
		return arepo.findAll();
	}

	// Delete Admin by ID
	public void deleteAdmin(Long id) {
		arepo.deleteById(id);
	}

	// Update Admin by ID
	public Admin updateAdmin(Admin admin) {
		Long id=admin.getId();
		Admin ad=arepo.findById(id).get();
		ad.setName(ad.getName());
		ad.setPassword(ad.getPassword());
		return arepo.save(ad);
	}
}
