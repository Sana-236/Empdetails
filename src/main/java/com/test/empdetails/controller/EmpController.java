package com.test.empdetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test.empdetails.other.Emp;
import com.test.empdetails.service.EmpService;

@RestController
@RequestMapping("/emp")
public class EmpController {
	@Autowired 
	EmpService empService;
	
	@GetMapping("/get/all")
	public List<Emp> getAll(){
		return empService.getAll();
		
		
	}
	
	@PostMapping("/add")
	public String add(@RequestBody Emp emp) {
		return empService.add(emp);
	}
	@PutMapping("/edit")
	public String edit(@RequestBody Emp emp) {
		return empService.edit(emp);
	}
	@DeleteMapping("/edit")
	public String delete(@RequestParam int empNo) {
		return empService.delete(empNo);
	}


}
