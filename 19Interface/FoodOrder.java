
interface zepto{
    void order(String msg);
    default void order1(String msg){
        System.out.println("order placed id from zepto: "+ msg);
    }
}
interface swiggy{
    void order(String msg);
    static void order1(String msg){
        System.out.println("order placed id from swiggy: "+ msg);
    }
}

class order implements zepto,swiggy{
    public void order(String msg){
        System.out.println("order placed id "+ msg);
    }
}
public class FoodOrder {
    public static void main(String[] args) {
        order o=new order();
        o.order("123");
        o.order1("456");
        swiggy.order1("789");
    }

    
}
