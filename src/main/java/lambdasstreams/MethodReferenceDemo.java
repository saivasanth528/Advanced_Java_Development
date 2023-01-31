package lambdasstreams;

import java.util.function.Consumer;
import java.util.stream.Stream;



public class MethodReferenceDemo {
    public static void main(String[] args) {
        Stream.of(1, 2, 3, 4, 5)
                .forEach(n ->System.out.println(n));

        Stream.of(1, 2, 3, 4, 5)
                .forEach(System.out::println);

        Consumer<Integer> printer = System.out::println;
        Stream.of(1, 2, 3, 4, 5)
                .forEach(printer);
    }
}
