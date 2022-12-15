package Interfaces;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DefaultMethodsDemo {
    public static void main(String args[]) {
        List<Integer> nums = Stream.of(-3, 1, -5, -8, -984, 1)
                .collect(Collectors.toList());
        System.out.println(nums);
        boolean removed = nums.removeIf(n -> n < 0);
        System.out.println(nums);
        nums.forEach(System.out::println);
    }
}
