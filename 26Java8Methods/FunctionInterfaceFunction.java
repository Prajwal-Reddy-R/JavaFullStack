// package 26Java8Methods;
import java.util.*;
import java.util.function.Function;

class SquareMapper implements Function<Integer, Integer> {
    @Override
    public Integer apply(Integer i) {
        return i * i;  // transform each element to its square
    }
}

public class FunctionInterfaceFunction {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,5,6,7,3,1);

        // Using Function class
        list.stream()
            .map(new SquareMapper())
            .forEach(i -> System.out.print(i + " "));

        System.out.println();

        // Using Anonymous Class
        list.stream()
            .map(new Function<Integer, Integer>() {
                @Override
                public Integer apply(Integer i) {
                    return i * i;
                }
            })
            .forEach(i -> System.out.print(i + " "));

        System.out.println();

        // Using Lambda
        list.stream()
            .map(i -> i * i)
            .forEach(i -> System.out.print(i + " "));
    }
}
