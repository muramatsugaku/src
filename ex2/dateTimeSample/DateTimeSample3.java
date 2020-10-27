package ex2.dateTimeSample;

import java.time.LocalDateTime;

class DateTimeSample3 {
    public static void main(String[] args) {
        //日付APIのメソッド
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("1年後:" + localDateTime.plusYears(1));
        System.out.println("1カ月後:" + localDateTime.plusMonths(1));
        System.out.println("1週間後:" + localDateTime.plusWeeks(1));
        System.out.println("1日後:" + localDateTime.plusDays(1));
        System.out.println("1時間後:" + localDateTime.plusHours(1));
        System.out.println("1分後:" + localDateTime.plusMinutes(1));
    }
}
