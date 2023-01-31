package lambdasstreams;

import java.util.stream.IntStream;

public class LazyStreams {

    public static int multiplyByTwo(int n) {
        System.out.println("Inside multiplyByTwo " + n * 2);
        return n * 2;
    }
 // Here the significance of laziness is we have not processed the entire stream, we stopped when
 //   we are done
    public static void main(String[] args) {
        int firstDoubleDivBy3 = IntStream.range(100, 200)
                .map(LazyStreams::multiplyByTwo)
                .filter(n -> n % 3 == 0)
                .findFirst()
                .orElse(999);

        System.out.println("First even Divisible by 3 " + firstDoubleDivBy3);
    }
}
