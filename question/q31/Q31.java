package question.q31;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Q31 {
    /**
     * CSV→Person変換
     * @param line String CSVレコード
     * @return Person Personインスタンス
     */
    public static Person toPerson(String line) {
        String[] column = line.split(",",3);
        String name = column[0];
        Gender gender = null;
        switch (column[1]) {
            case "男":
                gender = Gender.MEN;
                break;
            case "女":
                gender = Gender.WOMEN;
                break;
        }
        int age = Integer.parseInt(column[2]);
        return new Person(name,gender,age);
    }

    public static void main(String[] args) {
        Path path = Paths.get("src","question","a31","data.csv");
        List<Person> personList = new ArrayList<>(100);

        try(Stream<String> lines = Files.lines(path)) {
            personList = lines
                    .map(Q31::toPerson)
                    .sorted(Comparator.comparing(Person::getAge,Comparator.reverseOrder()))
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }

        personList.forEach(System.out::println);
    }
}
