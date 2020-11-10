package com.cg.eis.exception;

public class EmployeeException extends Exception{
	private String msg;

	public EmployeeException(String msg) {
		super();
		this.msg = msg;
	}	
	public String toString() {
		return msg;
	}

}
