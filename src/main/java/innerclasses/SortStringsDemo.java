package innerclasses;

import java.util.Arrays;
import java.util.List;

public class SortStringsDemo {
    public static void main(String[] args) {
        StringSorter stringSorter = new StringSorter();
        List<String> strings = Arrays.asList("this", "is", "a", "list", "of",
                "string", "demo");
        stringSorter.setStrings(strings);
        System.out.println(strings);
        System.out.println("After length sort");
        System.out.println(stringSorter.lengthSort());
        System.out.println("After Reverse Sorting");
        System.out.println(stringSorter.lengthReverseSortWithStreams());
    }
}
