package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Branch;
import com.example.demo.Service.BranchService;

@RestController
@RequestMapping("/branch")
public class BranchController {

	@Autowired
	private BranchService branchService;
	
	@GetMapping("/")
	public List<Branch> all(){
		return branchService.getAll();
	}
	@GetMapping("/{id}")
	public Branch getBranchById(@PathVariable(name = "id") Integer id) {
		return branchService.getBranchById(id);
	}
	@PostMapping("/create")
	public Branch addBranch(@RequestBody Branch branch) {
		return branchService.addbranch(branch);
	}
	
	@PutMapping("/update/{id}")
	public Branch editBranch(@PathVariable Integer id,@RequestBody Branch branch) {
		return branchService.editBranch(id,branch);
	}
	
}
