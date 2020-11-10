package com.cg.eis.bean;
import com.cg.eis.exception.EmployeeException;

public class Employee {
	private  int id;
	private String name;
	private double salary;
	private String designation;
	private char insuranceScheme;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) throws EmployeeException{
		if(salary<3000)
			throw new EmployeeException("Not Valid Salary");
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public char getInsuranceScheme() {
		return insuranceScheme;
	}
	public void setInsuranceScheme(char insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}
	/*public void display(double salary) throws EmployeeException {
		if(salary<3000)
			throw new EmployeeException("Not Valid Salary!!");
		System.out.println("Salary is :"+salary);
		
	}*/

}
