class greet {
    public static void main(String args []){
        System.out.println("Hello");
    }   
    
}

class add {
    public static void main(String args []){
        int a=5;
        int b=10;
        int sum=a+b;
        System.out.println("Sum of a and b is: "+sum);
    }   
    
}

public class userDefined {
    public static void main(String args []){
        add a = new add();
        a.main(args);
        
        greet g = new greet();
        g.main(args);
        
        

    }
    
}
