package acess_modifier;

public class StringBuilders1 {
	public static void main(String[]args) {
		StringBuilder cc = new StringBuilder();
		StringBuilder s1=cc;
		cc.append("program");
		System.out.println(s1==cc);
	}

}
