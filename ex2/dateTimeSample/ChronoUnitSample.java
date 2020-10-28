package ex2.dateTimeSample;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class ChronoUnitSample {
    public static void main(String[] args) {
        //経過時間のサンプル
        LocalDate birth = LocalDate.of(2000,10,28);
        System.out.println(ChronoUnit.DAYS.between(birth, LocalDate.now()));
        System.out.println(ChronoUnit.YEARS.between(birth, LocalDate.now()));
    }
}
