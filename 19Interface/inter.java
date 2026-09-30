interface animal{
    void eat();
    void sleep();
}
interface bird {
    void fly();
    void run();
}
class dog implements bird,animal{
    public void eat(){
        System.out.println("Dog is eating");
    }
    public void sleep(){
        System.out.println("Dog is sleeping");
    }
    public void fly(){
        System.out.println("Bird can fly");

    }
    public void run(){
        System.out.println("Can Bird run?");
    }
}
// class bird implements animal{
//     public void eat(){
//         System.out.println("Bird is eating");
//     }
//     public void sleep(){
//         System.out.println("Bird is sleeping");
//     }
// }

public class inter {
    public static void main(String args[]){
        dog d=new dog();
        d.eat();
        d.sleep();
        d.fly();
        d.run();
    }
    
}
