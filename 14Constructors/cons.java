

class car{
    String name;
    int price;
    car(String name,int price){
        this.name=name;
        this.price=price;
    }
}
public class cons {
    public static void main(String[] args) {
        car c1=new car("BMW",1000000);
        System.out.println("Car name is: "+c1.name);
        System.out.println("Car price is: "+c1.price);
    }
}
