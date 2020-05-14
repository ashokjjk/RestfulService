package com.ashok.app;
/**
 * Simple POJO implementation for Employee object
 * */
import org.springframework.stereotype.Component;

@Component
public class Employee {

	private String Name;
	private String Dept;
	private int RollNo;
	private int Salary;

	public Employee(String name, String dept, int rollNo, int salary) {

		Name = name;
		Dept = dept;
		RollNo = rollNo;
		Salary = salary;

	}

	public Employee() {

	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDept() {
		return Dept;
	}

	public void setDept(String dept) {
		Dept = dept;
	}

	public int getRollNo() {
		return RollNo;
	}

	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}

}
