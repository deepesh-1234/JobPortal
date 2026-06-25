package acess_modifier;

public class Final {
	String name = "xyz";
public String toString() {
	return name;
}
public static void main(String[]args) {
	Final final1 = new Final();
	System.out.println(final1.toString());
}
}
