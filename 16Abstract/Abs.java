// package 16Abstract;

abstract class Demo{
    abstract void greet();
    void bye(){
        System.out.println("bye");

    }
}

class demo1 extends Demo{
    void greet(){
        System.out.println("Hello");
    }
}

public class Abs {
    public static void main(String args[]){
        demo1 d = new demo1();
        d.greet();
        d.bye();

    }
    
}
