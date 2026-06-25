public class Bike {
    int price;
    String brand;
    String color;
    void display(int cost ,String company,String appearence){
        price =cost;
         brand = company;
         color =appearence;
         System.out.println(price+" " +brand+" "+color+"");
    }
         public static void main(String[] args){
            Bike bike =new Bike();
            bike.display(7000,"bmw","white");
          
    }
}
