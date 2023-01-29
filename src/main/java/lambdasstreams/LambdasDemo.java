package lambdasstreams;

import java.util.stream.Stream;

public class LambdasDemo {
    public static void main(String[] args) {
        // for each takes a consumer in lambda fashion
        Stream.of(1, 2, 3, 4, 5)
                .forEach(n -> System.out.println(n));



    }
}
