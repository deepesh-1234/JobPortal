package acess_modifier;

public class Unchecked {
 static void display() {
	String s=null;
	 System.out.println(s.charAt(2));
	 
 }
 public static void main(String[]args) {
	 try {
		 display();
	 }
	 catch(Exception e) {
		 System.out.println("handled");
	 }
	 finally {
		 System.out.println("hello");
	 }
	 System.out.println("after finally");
 }
}
