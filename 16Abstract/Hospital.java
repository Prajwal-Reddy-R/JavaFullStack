// package 16Abstract;

abstract class doctor{
    String name;
    int age;
    doctor(String name,int age){
        this.name=name;
        this.age=age;
    }
    abstract void neuro(String name,int age);
    abstract void cardio(String name,int age);
}

class care extends doctor{
       care(String name,int age){
        super(name, age);
         System.out.println("Doctor name:" + name);
        System.out.println("Doctor age:" + age);

       }
       
    
    void neuro(String name,int age){
        
        
        System.out.println("Doctor name :"+name);
        System.out.println("Doctor age :"+age);
    }
    void cardio(String name,int age){
        System.out.println("Doctor name :"+name);
        System.out.println("Doctor age :"+age);

    }
}
public class Hospital {
    public static void main(String[] args) {
        care c= new care("prajwal",22);
        c.neuro("prajwal",22);
        c.cardio("pavan",22);
        
    }

    
}
