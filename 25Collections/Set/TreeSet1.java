// package Set;

public class TreeSet1 {
    
    public static void main(String[] args) {
        // Create a TreeSet (stores elements in sorted order)
        Set<String> set = new TreeSet<>();

        // 1. add() → Insert elements
        set.add("Banana");
        set.add("Apple");
        set.add("Cherry");
        set.add("Apple"); // Duplicate ignored

        System.out.println("Initial TreeSet: " + set); // Sorted: [Apple, Banana, Cherry]

        // 2. first() and last() → Get smallest and largest
        System.out.println("First element: " + set.first());
        System.out.println("Last element: " + set.last());

        // 3. higher() and lower() → Nearest greater/smaller
        System.out.println("Element higher than Banana: " + set.higher("Banana"));
        System.out.println("Element lower than Banana: " + set.lower("Banana"));

        // 4. contains() → Check existence
        System.out.println("Contains Cherry? " + set.contains("Cherry"));

        // 5. remove() → Delete element
        set.remove("Banana");
        System.out.println("After removing Banana: " + set);

        // 6. size() and isEmpty()
        System.out.println("Size: " + set.size());
        System.out.println("Is empty? " + set.isEmpty());

        // 7. clear()
        set.clear();
        System.out.println("After clear(): " + set);
    }
}

    

