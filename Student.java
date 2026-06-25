package acess_modifier;

public class Student {
	int id;
	String name;
	String branch;
	int age;
	void display(int id, String name,String branch,int age ) {
		this.id=id;
		this.name=name;
		this.branch=branch;
		this.age=age;
		System.out.println(this.id);
		System.out.println(this.name);
		System.out.println(this.branch);
		System.out.println(this.age);
		
		
	}
	public static void main(String[]args) {
		Student student =new Student();
		student.display(1, "spider man", "bio", 26);
		Student student2 =new Student();
		student.display(2, "klaus mikelson", "hybrid", 1000);
	}

}
