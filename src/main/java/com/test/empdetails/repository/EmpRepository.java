package com.test.empdetails.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.test.empdetails.other.Emp;

@Repository
public class EmpRepository {
	public List <Emp> employee=new ArrayList<Emp>();
	public String Emp = null;

	public  List<Emp> getAll(){
		return employee;
	}

	public  String add(Emp emp) {
	     employee.add(emp);
	     return "successfully added";
	}

	public String edit(Emp emp) {
		employee.stream().filter(e->e.getId()==emp.getId()).forEach(e->{
			e.setDepartment(emp.getDepartment());
			e.setName(emp.getName());
			});
		return "Successfully updated";
	}

	public String delete(int empNo) {
		employee.remove(empNo-1);
		return "Deleted";
	}

	
}
