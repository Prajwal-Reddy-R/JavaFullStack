import java.util.*;
import java.util.function.Predicate;

class even implements Predicate<Integer> {
    @Override
    public boolean test(Integer t) {
        return t % 2 == 0;
    }
}

public class FunctionInterfacePredicate {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 5, 6, 7, 3, 1);

        list.stream().filter(new even()).forEach(i -> System.out.print(i + " ")); //using class implementing predicate interface
        System.out.println();


        // Using anonymous class for Predicate
        list.stream()
            .filter(new Predicate<Integer>() {
                @Override
                public boolean test(Integer t) {
                    return t % 2 == 0;  // condition for even numbers
                }
            })
            .forEach(i -> System.out.print(i + " "));

        System.out.println();


        list.stream().filter(i -> i % 2 == 0).forEach(i -> System.out.print(i + " ")); //using lambda expression
    }
    
}
