package ex2.streamSample;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class StreamSample6 {
    public static void main(String[] args) {
        List<Student> studentList = List.of(
                new Student("A","Nick",60),
                new Student("B","Tom",50),
                new Student("C","Jack",70),
                new Student("A","Michael",60),
                new Student("B","Matthew",70),
                new Student("C","Daniel",30),
                new Student("A","David",40),
                new Student("B","James",80),
                new Student("C","Robert",50)
        );

        //グループ分け
        Map<String,List<Student>> group = studentList.stream()
                .collect(Collectors.groupingBy(Student::getGroup));

        System.out.println("グループ分け");
        group.entrySet().stream()
                .map(e -> e.getKey() + ":"+ e.getValue().toString())
                .forEach(System.out::println);

        //グループごとの合計
        Map<String,Long> sum = studentList.stream()
                .collect(Collectors.groupingBy(Student::getGroup,Collectors.summingLong(Student::getScore)));

        System.out.println("グループごとの合計");
        sum.entrySet().stream()
                .map(e -> e.getKey() + ":"+ e.getValue())
                .forEach(System.out::println);

        //グループごとの平均
        Map<String,Double> average = studentList.stream()
                .collect(Collectors.groupingBy(Student::getGroup,Collectors.averagingDouble(Student::getScore)));

        System.out.println("グループごとの平均");
        average.entrySet().stream()
                .map(e -> e.getKey() + ":"+ String.format("%.2f",e.getValue()))
                .forEach(System.out::println);

        //グループごとの最大
        Map<String, Optional<Student>> max = studentList.stream()
                .collect(Collectors.groupingBy(Student::getGroup,Collectors.maxBy(Comparator.comparing(Student::getScore))));

        System.out.println("グループごとの最大");
        max.entrySet().stream()
                .map(e -> e.getKey() + ":"+ e.getValue())
                .forEach(System.out::println);

        //グループごとの最小
        Map<String, Optional<Student>> min = studentList.stream()
                .collect(Collectors.groupingBy(Student::getGroup,Collectors.minBy(Comparator.comparing(Student::getScore))));

        System.out.println("グループごとの最小");
        min.entrySet().stream()
                .map(e -> e.getKey() + ":"+ e.getValue())
                .forEach(System.out::println);
    }
}
