package ex2.streamSample;

import java.util.Comparator;
import java.util.List;

class StreamSample4 {
    public static void main(String[] args) {
        List<Data> dataList = List.of(
                new Data("101","あああ"),
                new Data("104","えええ"),
                new Data("103","かかか")
        );

        /*
            sorted
            https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/util/stream/Stream.html#sorted()
         */
        dataList.stream()
                .sorted(Comparator.comparing(Data::getId))
                .forEach(System.out::println);
        dataList.stream()
                .sorted(Comparator.comparing(Data::getName,Comparator.reverseOrder()))
                .forEach(System.out::println);
    }
}
