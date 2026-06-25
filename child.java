package acess_modifier;

public class child extends Bike {
	void display() {
		System.out.println("world");
	}
	public static void main(String[]args) {
		child child = new child();
		child.show();
		child.display();
		
	}

}
