package ex2.dateTimeSample;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.chrono.JapaneseDate;
import java.time.format.DateTimeFormatter;
import java.util.stream.IntStream;

class DateTimeFormatSample {
    public static void main(String[] args) {
        //日付書式のサンプル
        final String pattern ="yyyy/MM/dd(E)";
        IntStream.range(1,13)
                .mapToObj(i -> LocalDate.of(2020,i,1))
                .map(d -> DateTimeFormatter.ofPattern(pattern).format(d))
                .forEach(System.out::println);

        //時刻書式のサンプル
        final String timePattern = "ahh:mm:ss";
        IntStream.range(0,24)
                .mapToObj(i -> LocalTime.of(i,00,00))
                .map(t -> DateTimeFormatter.ofPattern(timePattern).format(t))
                .forEach(System.out::println);

        //和暦のサンプル
        final String patternJ = "Gy年M月d日(EEEE)";
        IntStream.range(1,13)
                .mapToObj(i -> JapaneseDate.of(1989,i,1))
                .map(d -> DateTimeFormatter.ofPattern(patternJ).format(d))
                .forEach(System.out::println);
    }
}
