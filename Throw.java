package acess_modifier;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Throw {
	static void display() throws ArithmeticException,FileNotFoundException{
		FileReader fileReader=new FileReader("abc.txt");
		 
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
		 System.out.println("Deepesh ");
	 }
}

