public class dm {
    public static void main(String[] args) {
        char ch='a';
        int avg=78;
        boolean backlogs = false;
        if(ch=='a'){
            if(avg>=65){
                if(backlogs=false){
                    System.out.println("you r eligible");
                }
                else{
                    System.out.println("you r not eligible");
                }
            }
            else{
            System.out.println("you r not eligible because less avg");
            }
        }
        else{
            System.out.println("you r not eligible for because another sec");
        }
    }
}
