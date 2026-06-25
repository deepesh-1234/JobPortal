package acess_modifier;

public class Bmw implements Car {
	public void milage() {
		System.out.println("10");
	}
	public void brand() {
		System.out.println("bmw");
	}
	public static void main(String[]args) {
		Bmw bmw =new Bmw();
		bmw.milage();
		bmw.brand();
	}
}
