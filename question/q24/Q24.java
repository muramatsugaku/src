package question.q24;
/*
Q24
営業日を求めるプログラム

受付日と営業日を指定したら、その日付を表示するプログラムを作成しなさい

例）
受付日：2020/10/30
営業日：5営業日後

ここでいう営業日とは土日と祝日を除いた日数の事
なので2020/11/9が5営業日後になる

2020年内の営業日を求める処理を作成すること
日付は入力方式として次の書式で入力されるとする

例）
受付日を入力してください
2020-10-30
営業日を入力してください
5
2020-10-30の5営業日後は2020-11-9です（出力）

参考
http://calendar.infocharge.net/cal/2020/
https://keisan.casio.jp/exec/system/1251361154
 */

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Q24 {
    private static List<LocalDate> holidayList;

    static {
        //祝日一覧
        holidayList = new ArrayList<>();
        holidayList.add(LocalDate.parse("2020-01-01"));
        holidayList.add(LocalDate.parse("2020-01-13"));
        holidayList.add(LocalDate.parse("2020-02-11"));
        holidayList.add(LocalDate.parse("2020-02-23"));
        holidayList.add(LocalDate.parse("2020-02-23"));
        holidayList.add(LocalDate.parse("2020-03-20"));
        holidayList.add(LocalDate.parse("2020-04-20"));
        holidayList.add(LocalDate.parse("2020-04-29"));
        holidayList.add(LocalDate.parse("2020-05-03"));
        holidayList.add(LocalDate.parse("2020-05-04"));
        holidayList.add(LocalDate.parse("2020-05-05"));
        holidayList.add(LocalDate.parse("2020-05-06"));
        holidayList.add(LocalDate.parse("2020-07-23"));
        holidayList.add(LocalDate.parse("2020-07-24"));
        holidayList.add(LocalDate.parse("2020-08-10"));
        holidayList.add(LocalDate.parse("2020-09-21"));
        holidayList.add(LocalDate.parse("2020-09-22"));
        holidayList.add(LocalDate.parse("2020-11-03"));
        holidayList.add(LocalDate.parse("2020-11-23"));
    }

    /**
     * 祝日判定
     * @param date 判定する日付
     * @return boolean 祝日であれば true そうでなければ false
     */
    static boolean isHoliDay (LocalDate date) {
        for (LocalDate holiday:holidayList) {
            if (holiday.equals(date)) {
                return true;
            }
        }
        return false;
    }

    /**
     * 営業日を求めるメソッド
     * @param date 開始日
     * @param daysAfter 営業日
     * @return LocalDate 営業日経過後の日付
     */
    static LocalDate getBusinessDay(LocalDate date,int daysAfter) {
        while (daysAfter >= 0) {
            /*
            //トレース用
            System.out.println("sta:" + date + (date.getDayOfWeek().getValue() == 6));
            System.out.println("sun:" + date + (date.getDayOfWeek().getValue() == 7));
            System.out.println("holiDay:" + date + isHoliDay(date));
            */
            if (date.getDayOfWeek().getValue() == 6//土曜日なら
                    || date.getDayOfWeek().getValue() == 7//日曜日なら
                    || isHoliDay(date))//祝日なら
            {
                date = date.plusDays(1);//日付を1日勧める
                //System.out.println("skip");
                continue;//スキップ
            } else {
                date = date.plusDays(1);//日付を1日勧める
                //System.out.println("count");
                daysAfter--;//処理回数を減らす
            }
        }
        return date.minusDays(1);//whieの減らしすぎを補正
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//スキャナオブジェクト作成
        System.out.println("受付日を入力してください");//受付日の入力メッセージ
        String date = sc.nextLine();//受付日の入力
        System.out.println("営業日を入力してください");//営業日の入力メッセージ
        int daysAfter = sc.nextInt();//営業日の入力
        LocalDate businessDay = getBusinessDay(LocalDate.parse(date),daysAfter);//受付日のLoaclDateインスタンス生成
        System.out.println(String.format("%sの%d営業日後は%sです",date,daysAfter,businessDay));//結果表示
    }
}
