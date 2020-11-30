package question.q33;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

class Q331 {
    public static void main(String[] args) {
        Path person = Paths.get("src","question","q33","person.csv");

        try (Stream<String> lines = Files.lines(person)) {
            lines.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
