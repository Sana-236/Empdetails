package com.test.empdetails.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.empdetails.other.Emp;
import com.test.empdetails.repository.EmpRepository;

@Service

public class EmpService {
	@Autowired 
	EmpRepository empRepository;
	
	public List<Emp> getAll() {
		return empRepository.getAll();
	}
	public String add(Emp emp) {
		// TODO Auto-generated method stub
		return empRepository.add(emp);
	}
	public String edit(Emp emp) {
		// TODO Auto-generated method stub
		return empRepository.edit(emp);
	}
	
	public String delete(int empNo) {
		// TODO Auto-generated method stub
		return empRepository.delete(empNo);
	}
	
}
