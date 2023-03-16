package com.test.empdetails;

//import java.util.Arrays;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import com.test.empdetails.other.Emp;
//import com.test.empdetails.repository.EmpRepository;

@SpringBootApplication
public class EmpdetailsApplication{
	//@Autowired
//	EmpRepository empRepository;

	public static void main(String[] args) {
		SpringApplication.run(EmpdetailsApplication.class, args);
	}

	/*@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
        Emp e1=new Emp(1,"sana","mpl");
		Emp e2=new Emp(2,"halsu","blr");
		EmpRepository.employee.addAll(Arrays.asList(e1,e2));
		
	}*/

}
