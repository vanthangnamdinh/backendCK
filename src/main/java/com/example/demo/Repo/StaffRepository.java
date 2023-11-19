package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Staff;

@Repository
public interface StaffRepository extends JpaRepository<Staff, Integer>{
	Staff getStaffByMaNhanVien(Integer id);
}
