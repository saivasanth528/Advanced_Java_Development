package newio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilesDemo {
    public static void main(String args[]) throws IOException {
        Files.createDirectory(Paths.get("data"));
        Files.createDirectories(Paths.get("sub1", "sub2", "sub3"));
        Files.createFile(Paths.get("sub1", "sub2", "sub3", "myfile.txt"));
        Files.deleteIfExists(Paths.get("sub1", "sub2", "sub3", "myfile.txt"));
        Files.deleteIfExists(Paths.get("data"));
        Files.deleteIfExists(Paths.get("sub1", "sub2", "sub3"));
        Files.deleteIfExists(Paths.get("sub1", "sub2"));
        Files.deleteIfExists(Paths.get("sub1"));

        Path sourceDir = Paths.get("newio");
        Path dataFile = sourceDir.resolve("data.txt");

        System.out.println(Files.lines(dataFile).collect(Collectors.toList()));

        Path destination = sourceDir.resolve("data_copy.txt");
        Files.copy(dataFile, destination);

        Path other = sourceDir.resolve("data_moved.txt");
        Files.move(destination, other);

        Files.deleteIfExists(other);

        Path javaDir = Paths.get("newio");

        try(Stream<Path> entries = Files.walk(javaDir)) {
            entries.forEach(System.out::println);
        }

    }
}
