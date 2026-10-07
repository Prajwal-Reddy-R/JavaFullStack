interface sum{
    // int add(int a,int b);
    int sub(int c,int d);
}
// class addition implements sum{
//     public int add(int a,int b){
//         return a+b;

//     }

// }
public class AnonymousAdd {
    public static void main(String args[]){
        // addition a=new addition();
        sum i=(int a,int b)->{
            return a+b;
        };
        
               
                
        // System.out.println(i.add(5,8));
        System.out.println(i.sub(5,8));
     
}
}
