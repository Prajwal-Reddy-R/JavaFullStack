// package 17Polymorphism;.

class parent{
    void mobile(){
        System.err.println("parent mobile");
    }
}
class child extends parent{
    void mobile(){
        System.err.println("child mobile");
    }

}

public class overridding {
    public static void main(String[] args) {
        child c= new child();
        c.mobile();
    }
    
}
