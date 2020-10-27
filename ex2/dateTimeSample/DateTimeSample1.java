package ex2.dateTimeSample;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

//日時の初期化
class DateTimeSample1 {
    public static void main(String[] args) {
        //現在日時
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);

        //任意の日時を設定
        LocalDate date = LocalDate.of(2020,6,2);
        LocalTime time = LocalTime.of(18,0);
        LocalDateTime dateTime = LocalDateTime.of(2020, Month.JULY,1,0,0);
        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);

        //日付文字列による設定
        LocalDate charDate = LocalDate.parse("2030-01-01");
        LocalTime charTime = LocalTime.parse("20:30:00");
        LocalDateTime charDateTime = LocalDateTime.parse("2030-01-01T20:30:00");
        System.out.println(charDate);
        System.out.println(charTime);
        System.out.println(charDateTime);
    }
}
