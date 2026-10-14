// package 26Java8Methods;
import java.util.*;
import java.util.function.Consumer;

class print implements Consumer<Integer>{
    public void accept(Integer i){
        System.out.print(i+" ");
    }
}
public class FunctionInterfaceConsumer {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,5,6,7,3,1);

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" "); //using for loop
        }

        System.out.println();
        for(int num:list){  //using for-each loop
            System.out.print(num+" ");
        }
        System.out.println();

        list.forEach(i->System.out.print(i+" "));  //using lambda expression
        System.out.println();

                // Using Anonymous Class
        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer i) {
                System.out.print(i + " ");
            }
        });
        System.out.println();

        list.forEach(new print()); //using class implementing consumer interface
    }
    
}
