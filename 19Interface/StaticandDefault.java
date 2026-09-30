interface animal{
    default void eat(){
        System.out.println("animals can eat");
    }
    static void sleep(){
        System.out.println("animals can sleep");
    }
}
class dog implements animal{

}

public class StaticandDefault {
    public static void main(String args[]){
        animal d=new dog();
        d.eat();
        animal.sleep();
    }
    
}
