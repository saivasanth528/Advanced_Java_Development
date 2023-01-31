package lambdasstreams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.Optional;

public class ProcessDictionary {
    public static void main(String[] args) throws IOException {
        Files.lines(
                Paths.get("/", "usr", "share", "dict", "web2"))
                .filter(s -> s.length() > 10)
                .map(String::toLowerCase)
                .sorted(Comparator.comparingInt(String::length).reversed())
                .limit(10)
                .forEach((String w) ->
                                System.out.printf("%s (%d)%n", w, w.length())
                        );

       Optional<String> max =  Files.lines(
                Paths.get("/", "usr", "share", "dict", "web2"))
                .filter(s -> s.length() > 10)
                .map(String::toLowerCase)
                .sorted(Comparator.comparing(String::length).reversed())
                .findFirst();
       System.out.println("******Optional Demo ******");
       System.out.println(max.isPresent() ? max.get() : max.orElse("Nothing"));
       System.out.println(max.orElseGet(() -> "nothing"));
       System.out.println(max.orElse("nothing"));
    }
}
