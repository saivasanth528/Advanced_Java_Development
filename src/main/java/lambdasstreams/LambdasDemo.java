package lambdasstreams;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class LambdasDemo {
    public static void main(String[] args) {
        // for each takes a consumer in lambda fashion

        Stream.of(1, 2, 3, 4, 5)
                .forEach(n -> System.out.println(n));

        // anonymous class in java
        Stream.of(1, 2, 3, 4, 5, 6)
                .forEach(new Consumer<Integer>() {
                    @Override
                    public void accept(Integer integer) {
                        System.out.println(integer);
                    }
                });

        // Define the consumer separately

        Consumer<Integer> printer = n -> System.out.println(n);
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);
        stream.forEach(printer);

        System.out.println();
        // predicate returns boolean
        Predicate<Integer> mod3 = n -> n % 3 == 0;
        Stream.of(1, 2, 3, 4, 5).filter(mod3)
                .forEach(printer);

        System.out.println();

        // Function of one type return other type
        Function<Integer, Integer> doubler = n -> n * 2;

        Stream.of(1, 2, 3, 4, 5, 6)
                .map(doubler)
                .filter(mod3)
                .forEach(printer);

    }
}
