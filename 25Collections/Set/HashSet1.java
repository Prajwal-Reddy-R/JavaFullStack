// package Set;

import java.util.*;

public class HashSet1 {
    public static void main(String[] args) {
   
        // Create a HashSet
        HashSet<String> set = new HashSet<>();

        // 1. add() → Insert elements
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple"); // Duplicate ignored

        System.out.println("Initial Set: " + set);

        // 2. contains() → Check if element exists
        System.out.println("Contains Banana? " + set.contains("Banana"));

        // 3. remove() → Delete an element
        set.remove("Banana");
        System.out.println("After removing Banana: " + set);

        // 4. size() → Number of elements
        System.out.println("Size of set: " + set.size());

        // 5. isEmpty() → Check if empty
        System.out.println("Is set empty? " + set.isEmpty());

        // 6. iterator() → Loop through elements
        System.out.print("Iterating: ");
        for (String fruit : set) {
            System.out.print(fruit + " ");
        }
        System.out.println();

        // 7. clear() → Remove all elements
        set.clear();
        System.out.println("After clear(): " + set);
        System.out.println("Is set empty now? " + set.isEmpty());
    }
}

        

    
    
