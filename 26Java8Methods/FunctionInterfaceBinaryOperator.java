import java.util.*;
import java.util.function.BinaryOperator;

class add implements BinaryOperator<Integer> {
    @Override
    public Integer apply(Integer t, Integer u) {
        return t + u;  // returns the sum of two integers
    }
}

public class FunctionInterfaceBinaryOperator{
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 3, 5, 6, 7, 3, 1);

        // Using BinaryOperator class
        Integer sum = list.stream()
            .reduce(new add())
            .get(); // returns the sum of all elements in the list
        System.out.println("Sum using BinaryOperator class: " + sum);

        // Using Anonymous Class
        sum = list.stream()
            .reduce(new BinaryOperator<Integer>() {
                @Override
                public Integer apply(Integer t, Integer u) {
                    return t + u; // returns the sum of two integers
                }
            }).get();
          
        System.out.println("Sum using Anonymous Class: " + sum);

        // Using Lambda Expression
        sum = list.stream()
            .reduce((t, u) -> t + u)
            .get();
        System.out.println("Sum using Lambda Expression: " + sum);
    }

}