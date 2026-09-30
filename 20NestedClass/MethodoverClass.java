// package 20NestedClass;

class outer{
    
    void outerclass(){
     class inner{
        private int a=10;
        private void inner(){

            System.out.println("Inner class");
        }

    }
        inner obj=new inner();
        obj.inner();
        System.out.println(obj.a); 

    }
}
public class MethodoverClass {
    public static void main(String args[]){
        outer obj1=new outer();
        obj1.outerclass();
    }
}


