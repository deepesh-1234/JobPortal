package acess_modifier;

public class perfect {
	public static void main(String[] args) {
		int n=6;
		int temp=n;
		int count=0;
		for(int i=1;i<=n/2;i++ ) {
			if(n%i==0) {
				count+=i;
			}
		}
		if(temp==count) {
			System.out.println("strong number");
		}
		else {
			System.out.println("non strong number");
		}
	}

}
