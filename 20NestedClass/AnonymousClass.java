
interface anony{
    void display();
}

public class AnonymousClass{
    public static void main(String[] args) {
           anony a=()->{ //using lambda
                System.out.println("Anonymous Class");
            };
        
        a.display();

        // anony a=new anony() 
        // {
        //     public void display(){
        //         System.out.println("Anonymous Class");
        //     }
        // };
        // a.display();

    }
}