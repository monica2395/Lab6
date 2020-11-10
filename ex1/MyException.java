package ex1;

public class MyException extends Exception{
	private String msg;

	public MyException(String msg) {
		super();
		this.msg = msg;
	}	
	public String toString() {
		return msg;
	}

}
