// package 20NestedClass;

class outer{
    private class inner{
        private int a=10;
        private void inner(){

            System.out.println("Inner class");
        }

    }
    void outerclass(){
        inner obj=new inner();
        obj.inner();
        System.out.println(obj.a);

    }
}
public class innerclass {
    public static void main(String args[]){
        outer obj1=new outer();
        obj1.outerclass();
    }
}
