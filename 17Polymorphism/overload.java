// package 17Polymorphism;

class action{
    void add(int a,int b){
        System.out.println(a+b);
    }
    void add(int a,int b,int c){
        System.out.println(a+b+c);
    }

}
public class overload {
    public static void main(String[] args) {
        action a=new action();
        a.add(3,4);
        a.add(4,5,6);
    }
    
}
