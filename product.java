public class product {
    public static void main(String[] args) {
        int n=123, pro=1;

while(n>0){
pro*=n%10;
n/=10;
}

System.out.println(pro);
    }
}
