package acess_modifier;

public class Strong_Numbers {
public static void main(String[] args) {
	int a=145;
	int sum=0;
	int b=a;
	while(a>0) {
		int last=a%10;
		int fact=1;
		for(int i=1;i<=last;i++) {
			fact=fact*i;
			
		}
		sum=sum+fact;
		a=a/10;
	}
	if(b==sum) {
		System.out.println("strong");
	}
	else {
		System.out.println("not Strong");
	}
}
}
