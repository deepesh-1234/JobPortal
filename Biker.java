public class Biker {
    int price;
    String brand;
    String color;
    void display(int price,String brand,String color){
       this.price = price ;
         this.brand = brand ;
         this.color = color;
         System.out.println(price+" " +brand+" "+color+"");
    }
         public static void main(String[] args){
            Biker bike =new Biker();
            Biker bike2 =new Biker();
            bike.display(7000,"bmw","white");
          bike.display(7888, "j", "khopgo");
    }
}

