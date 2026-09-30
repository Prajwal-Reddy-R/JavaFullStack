interface animal{
    void eat();
}
interface mammal extends animal{
    void walk();
}
interface DogBehaviour extends mammal{
    void bark();
}

class dog implements DogBehaviour{
    public void eat(){
        System.out.println("dog is eating");
    }
    public void walk(){
        System.out.println("dog is walking");
    }
    public void bark(){
        System.out.println("dog is barking");
    }
}

public class multilevel {
    public static void main(String[] args) {
        dog d=new dog();
        d.eat();
        d.walk();
        d.bark();
    }
    
}
