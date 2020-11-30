package question.q33;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Q335 {
    public static void main(String[] args) {
        Path person = Paths.get("src","question","q33","person.csv");
        Path men = Paths.get("src","question","q33","men.csv");

        try (Stream<String> lines = Files.lines(person);
             BufferedWriter bw = Files.newBufferedWriter(men)) {
            List<String> writeLine = lines.map(Person::fromCsv)
                    .filter(p -> "男".equals(p.getGender().getName()))
                    .sorted(Comparator.comparing(Person::getAge,Comparator.reverseOrder()))
                    .map(Person::toCsv)
                    .collect(Collectors.toList());
            writeLine.forEach(line -> {
                try {
                    bw.write(line);
                    bw.newLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
