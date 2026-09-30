// package 12ClassAndObj;

class Person{
    String name="Prajwal";
    int age=21;
}
class car{
    String model="BMW";
    String color="Black";
    int dateofmanufacture=2020;
}
public class ClassandObj {
    public static void main(String args[]){
        Person p1=new Person();
        car c1=new car();
        System.out.println("Person Details:");
        System.out.println(p1.name);
        System.out.println(p1.age);
        System.out.println("Car Details:");
        System.out.println(c1.model);
        System.out.println(c1.color);
        System.out.println(c1.dateofmanufacture);
    }
    
}
