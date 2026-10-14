import java.util.*;
import java.util.stream.Stream;


public class Stream1 {
    public static void main(String [] args){
        List<Integer> list = Arrays.asList(1,3,5,6,7,3,1);
        Stream<Integer> stream = list.stream();
        stream.forEach(System.out::print);  //using method reference
        System.out.println();
        stream.forEach(i->System.out.print(i+" "));  //using lambda
    }
}
