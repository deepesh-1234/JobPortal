public class while1 {
    public static void main(String[] args) {
        int num = 1992;
        while(num!=0){
            int last=num%10; 
            System.out.println(last);
            num = num/10;
        }
    }
}
