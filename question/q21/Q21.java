package question.q21;

/*
今月のカレンダーの作成
次のようなカレンダーを作成する

アルゴリズムのヒント
１．1日の曜日を求めて書き出しの位置を決める
２．1行目の処理と2行目以降の処理は分けて考えると良い
３．7日分書き出して改行するのが基本の処理

2020 10
                  1   2   3
  4   5   6   7   8   9  10
 11  12  13  14  15  16  17
 18  19  20  21  22  23  24
 25  26  27  28  29  30  31

 */

import java.time.LocalDate;
import java.time.Month;


class Q21 {
    /**
     * カレンダー作成して出力するメソッド
     * @param year int 作成する年
     * @param month Month 作成する月
     */
    public static void createCalender(int year, Month month) {
        //初期設定
        LocalDate firstDay = LocalDate.of(year,month,1);//月初のインスタンス作成
        int lengthOfMonth = firstDay.lengthOfMonth();//その月の長さを求める
        int offset = firstDay.getDayOfWeek().getValue();//1日の曜日からオフセットを求める
        if (offset == 7) offset = 0;//日曜日ならオフセットを０にする
        int dayOfMonth = 1;//出力用の日付

        //最初の行
        System.out.println(String.format("\n%d %d",firstDay.getYear(),firstDay.getMonth().getValue()));//月の見出し行
        for (int i = 1; i < 8; i++) {//7日分の出力をする
            if (offset > 0) {//オフセットが存在するなら
                System.out.print("    ");//オフセットの出力
                offset--;//オフセットの数を減らす
            } else {
                System.out.print(String.format(" %2d ",dayOfMonth++));//日付の出力
            }
        }
        System.out.println();//改行

        //2行目以降
        Label:for (int i = 2; i < 7; i++) {//42マスあればカレンダーは完成できるため最大で6行目まで
            for (int j = 1; j < 8; j++) {//7日分の出力をする
                if (dayOfMonth > lengthOfMonth) {//日付が月末を超えたら
                    if (j != 1) System.out.println("");//月末の改行の出力
                    break Label;//日付の出力の終了
                }
                System.out.print(String.format(" %2d ",dayOfMonth++));//日付の出力
            }
            System.out.println();//改行
        }
    }

    public static void main(String[] args) {
        int year = 2020;//出力年の設定
        for (Month month:Month.values()) {//列挙型Monthを拡張forで順次取り出す
            createCalender(year,month);//カレンダー作成メソッドの呼び出し
        }
    }
}
