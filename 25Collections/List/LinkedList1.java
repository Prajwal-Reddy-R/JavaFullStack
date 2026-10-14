package List;
// package 25Collections;

import java.util.*;

public class LinkedList1 {
    public static void main(String[] args){
        
        LinkedList<Integer> list=new LinkedList<>();

        //methods of LinkedList class

        list.add(10);
        list.add(20);
        list.addFirst(5);
        list.addLast(30);
        list.add(1, 15);
        System.out.println(list);
        list.remove(2);
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains(20));
        list.set(0, null);
        System.out.println(list);
        

    }
    
}
