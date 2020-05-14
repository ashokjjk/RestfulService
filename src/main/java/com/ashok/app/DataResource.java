package com.ashok.app;

/**
 * @author AshokKumar
 * 
 * Simple RESTful Service implemetation
 * with non-persistent data
 * */
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataResource {
	List<Employee> data = new ArrayList<Employee>();

	@GetMapping("api/employee")
	public List<Employee> getData() {

		Employee e1 = new Employee();
		e1.setName("Ashok");
		e1.setDept("Admin");
		e1.setRollNo(1011);
		e1.setSalary(2500);

		data.add(e1);

		Employee e2 = new Employee();
		e2.setName("Rajesh");
		e2.setDept("Developing");
		e2.setRollNo(1012);
		e2.setSalary(3400);

		data.add(e2);

		Employee e3 = new Employee();
		e3.setName("Vimal");
		e3.setDept("Testing");
		e3.setRollNo(1013);
		e3.setSalary(4020);

		data.add(e3);

		Employee e4 = new Employee();
		e4.setName("Priya");
		e4.setDept("Analyst");
		e4.setRollNo(1014);
		e4.setSalary(5540);

		data.add(e4);

		return data;

	}

	@GetMapping("api/employee/id/{id}")
	public Employee getEmployee(@PathVariable int id) {
		for (Employee emp : data) {
			if (emp.getRollNo() == id) {
				return emp;
			}
		}
		return new Employee();
	}

}
