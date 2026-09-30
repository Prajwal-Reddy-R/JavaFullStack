import java.util.*;

class product{
    // String name;
    // double price;
    // int quantity;
    double total_price;

    void display(String name,double price,int quantity){
        System.out.println(name+" "+price+" "+quantity);
    }
    void price(double price,int quantity){
        total_price=price*quantity;
        System.out.println("Total price is: "+(total_price));

    }
    void offer(){

        if(total_price>=500){
            System.out.println("Discount price :"+(total_price-100));
        }
        else if(total_price>=200 && total_price<500){
            System.out.println("Discount price :"+(total_price-50));

        }
        else{
            System.out.println("No discount");
        }

    }
    // System.out.println("name:"+name); find err?
}

public class Products {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the product name:");
        String nam=sc.nextLine();
        System.out.println("Enter price of product");
        double pr=sc.nextDouble();
        System.out.println("Enter quantity of product");
        int q=sc.nextInt();
        product p1=new product();
        p1.display(nam,pr,q);
        p1.price(pr,q);  
        p1.offer();
        sc.close();
    }
}
