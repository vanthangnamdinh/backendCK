package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Branch;
import com.example.demo.Repo.BranchRepository;

@Service
public class BranchService {
	
	@Autowired
	private BranchRepository branchRepository;
	
	public List<Branch> getAll(){
		return branchRepository.findAll();
	}
	public Branch addbranch(Branch branch) {
		if(branch!=null) {
			return branchRepository.save(branch);
		}
		return null;
	}
	public Branch getBranchById(Integer id) {
		return branchRepository.getBranchByMaChiNhanh(id);
	}
	public Branch editBranch(Integer id, Branch branch) {
		Branch existBranch =branchRepository.getBranchByMaChiNhanh(id);
		if(existBranch != null) {
			existBranch.setTenChiNhanh(branch.getTenChiNhanh());
			existBranch.setDiaChi(branch.getDiaChi());
			existBranch.setSoDienThoai(branch.getSoDienThoai());
			return branchRepository.save(existBranch);
		}
		return null;
	}
}
