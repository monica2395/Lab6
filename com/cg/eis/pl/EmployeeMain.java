package com.cg.eis.pl;

import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.exception.EmployeeException;
import com.cg.eis.service.EmployeeServiceImp;

public class EmployeeMain {
	public static EmployeeServiceImp obj;
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		EmployeeServiceImp obj=new EmployeeServiceImp();
	
		obj.displayEmployeeDetail(obj.getEmployeeDetails());
	}
}
