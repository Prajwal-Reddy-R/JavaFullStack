
class Order implements Runnable{
    String orderName;
    int orderId;

     Order(String orderName, int orderId) {
        this.orderName = orderName;
        this.orderId = orderId;
    }

    
   public void run() {
        try {
            System.out.println("Order " + orderId + " (" + orderName + ") accepted.");
            Thread.sleep(1000); //  accepting order
            

            System.out.println("Order " + orderId + " (" + orderName + ") is being prepared...");
            Thread.sleep(2000); //  food preparation
            

            System.out.println("Order " + orderId + " (" + orderName + ") is being packed...");
            Thread.sleep(1000); //  packing
            

            System.out.println("Order " + orderId + " (" + orderName + ") is ready for delivery!"); // ready for delivery
            
        } catch (InterruptedException e) {
            System.out.println("Order " + orderId + " (" + orderName + ") was interrupted.");
        }
    }
}

public class FoodDelivery {
    public static void main(String[] args) {
        Order order1 = new Order("Pizza", 101);
        Order order2 = new Order("Burger", 102);    
        Order order3 = new Order("Briyani", 103);

        Thread thread1 = new Thread(order1);
        Thread thread2 = new Thread(order2);
        Thread thread3 = new Thread(order3);

        thread1.start();
        thread2.start();
        thread3.start();
    }
    
}
