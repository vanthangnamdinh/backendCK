package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Staff;
import com.example.demo.Repo.StaffRepository;

@Service
public class StaffService {

	@Autowired
	private StaffRepository staffRepository;
	
	public List<Staff> getAllStaff() {
		return staffRepository.findAll();
	}
//	public Staff updateStaff(Integer id,Staff staff) {
//		Staff existStaff =staffRepository.getStaffByMaNhanVien(id);
//		existStaff.se
//	}
 }
