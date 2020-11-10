package ex2;


public class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void display(int age) throws MyException {
		if(age<=15)
				throw new MyException("Invalid Age!!");
		System.out.println("Age is "+age);
		
	}
	
}
