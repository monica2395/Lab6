package ex1;

public class Person {
	private String firstName;
	private String lastName;
	private char gender;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName){
		
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public Person(String firstName, String lastName, char gender) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
	}
	public void display(String firstName,String lastName) throws MyException {
		if(firstName.equals(" ") && lastName.equals(" "))
				throw new MyException("Invalid Name!");
		System.out.println(firstName);
		System.out.println(lastName);
	}

}
