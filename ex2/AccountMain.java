package ex2;

public class AccountMain {
	public static void main(String[] args) {
		Person obj=new Person("Kaith",22);
	
		try {
			obj.display(22);
		} catch (MyException e) {
			
			System.out.println(e);
		}
		SavingAccount acc=new SavingAccount(123489L,7000,obj,7000);
		System.out.println(acc);
		acc.withdraw(9000);


	}
}
