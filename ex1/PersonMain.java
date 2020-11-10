package ex1;

import java.util.Scanner;

public class PersonMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Person obj=new Person("Monica","Panigrahy",'F');
		System.out.println("Using Parametrized Constructor:");
		try {
			obj.display(" "," ");
		} catch (MyException e) {
			
			System.out.println(e);
		}
	
		System.out.println(obj.getGender());

	}


}
