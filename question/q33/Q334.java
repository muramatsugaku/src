package question.q33;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

class Q334 {
    public static void main(String[] args) {
        Path person = Paths.get("src","question","q33","person.csv");

        try (Stream<String> lines = Files.lines(person)) {
            lines.map(Person::fromCsv)
                    .filter(p -> "女".equals(p.getGender().getName()))
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
