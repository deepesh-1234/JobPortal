package acess_modifier;

public class Throw2 extends Exception {
public String getMessage() {
	return "Invalid age";
}
public static void main(String[]args) {
	int age=17;
	if(age>=18) {
		System.out.println("valid");
	}
	else {
		try {
			throw new Throw2();
		}
		catch(Exception i) {
			
		}
	}
}
}
