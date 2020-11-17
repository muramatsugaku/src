package ex2.streamSample;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class StreamSample7 {
    public static void main(String[] args) {
        List<Integer> integerList = List.of(4, 8, 5, 9, 1, 3, 7, 2, 8, 6, 0);

        integerList.stream().findFirst().ifPresent(System.out::println);
        integerList.stream().findAny().ifPresent(System.out::println);
        integerList.stream().max(Comparator.naturalOrder()).ifPresent(System.out::println);
        integerList.stream().min(Comparator.naturalOrder()).ifPresent(System.out::println);

        IntStream.range(1,10).forEach(System.out::println);//1~9
        IntStream.rangeClosed(1,10).forEach(System.out::println);//1~10

        //Mapに変換
        List<Data> dataList = List.of(
                new Data("101","あああ"),
                new Data("104","えええ"),
                new Data("103","かかか")
        );

        Map<String,Data> dataMap = dataList.stream()
                .collect(Collectors.toMap(d -> d.getId(),d -> d));

    }
}