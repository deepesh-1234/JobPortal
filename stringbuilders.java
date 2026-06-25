package acess_modifier;

public class stringbuilders {
	public static void main(String[]args) {
		stringbuilder cc = new StringBuilder();
		StringBuilder s1=cc;
		  cc.append("program");
		System.out.println(s1==cc);
	}

}
