
class customer extends Thread{
    String address;
    String name;
    customer(String name, String address){
        this.name = name;
        this.address = address;
    }
    public void run(){
        System.out.println("Customer name: "+name);
        System.out.println(name+" your order is placed and being processed");
        System.out.println("Customer address: "+address);
    }

}
class order extends Thread{
    String orderId;
    String orderName;
    double orderPrice;
    order(String orderId, String orderName, double orderPrice){
        this.orderId = orderId;
        this.orderName = orderName;
        this.orderPrice = orderPrice;
    }
    public void run(){
        System.out.println("Order ID: "+orderId);
        System.out.println("Order Name: "+orderName);
        System.out.println("Order Price: "+orderPrice);
    }

}
class deliveryPartner extends Thread{
    String DeliveryPartnerName;
    long phoneNumber;
    deliveryPartner(String DeliveryPartnerName, long phoneNumber){
        this.DeliveryPartnerName = DeliveryPartnerName;
        this.phoneNumber = phoneNumber;
    }
    public void run(){
        System.out.println("Delivery Partner Name: "+DeliveryPartnerName);
        System.out.println("Delivery Partner Phone Number: "+phoneNumber);
    }

}

public class FoodOrder {
    public static void main(String[] args)throws InterruptedException{
        
        customer c1 = new customer("Prajwal", "123 Main St");
        order o1 = new order("ORD001", "Pizza", 15.99);
        deliveryPartner d1 = new deliveryPartner("Riya", 1234567890L);

   

        c1.start();
        c1.join();
        
        o1.start();
        o1.join();  

        d1.start();
        
    }
    
}
