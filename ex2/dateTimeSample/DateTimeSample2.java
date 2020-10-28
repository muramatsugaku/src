package ex2.dateTimeSample;

import java.time.LocalDateTime;

class DateTimeSample2 {
    public static void main(String[] args) {
        //日付データの取得
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("年:" + localDateTime.getYear());
        System.out.println("月:" + localDateTime.getMonth());
        System.out.println("月:" + localDateTime.getMonthValue());
        System.out.println("日:" + localDateTime.getDayOfMonth());
        System.out.println("曜日:" + localDateTime.getDayOfWeek());
        System.out.println("時:" + localDateTime.getHour());
        System.out.println("分:" + localDateTime.getMinute());
        System.out.println("秒:" + localDateTime.getSecond());
        System.out.println("ナノ秒:" + localDateTime.getNano());
    }
}
