package List;
// package 25Collections;
import java.util.*;

public class Vector1 {
    public static void main(String[] args){
        
        Vector<Integer> vector=new Vector<>();

        //methods of Vector class

        vector.add(10);
        vector.add(20);
        vector.add(30);
        System.out.println(vector);
        System.out.println(vector.capacity());
        System.out.println(vector.size());
        System.out.println(vector.contains(20));
        System.out.println(vector.isEmpty());
        System.out.println(vector.indexOf(30));
        System.out.println(vector.lastIndexOf(10));
        vector.remove(1);
        System.out.println(vector);
        vector.set(0, 100);
        System.out.println(vector);

    }
}
