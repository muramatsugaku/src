package ex2.dateTimeSample;

import java.time.LocalDate;
import java.util.stream.IntStream;

class DateTimeSample4 {
    public static void main(String[] args) {
        //月末の取得
        for (int i = 1; i < 13; i++) {
            LocalDate date = LocalDate.of(2020,i,1);//各月の月初
            System.out.println(date.lengthOfMonth());//各月末の日（日にちのみ）
        }

        for (int i = 1; i < 13; i++) {
            LocalDate date = LocalDate.of(2020,i,1);//各月の月初
            System.out.println(date.withDayOfMonth(date.lengthOfMonth()));//各月末（年月日）
        }

        /*
        //参考
        IntStream.range(1,13)
                .mapToObj(i -> LocalDate.of(2020,i,1))
                .map(d -> d.lengthOfMonth())
                .forEach(System.out::println);
        IntStream.range(1,13)
                .mapToObj(i -> LocalDate.of(2020,i,1))
                .map(d -> d.withDayOfMonth(d.lengthOfMonth()))
                .forEach(System.out::println);
         */
    }
}
