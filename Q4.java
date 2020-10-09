package question;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        //入力された文字列とキーワードを比較する
        String keyword = "abcdef";//これは自由な初期値で

        //入力処理
        Scanner sc = new Scanner(System.in);
        System.out.println("キーワードを入力してください");
        String str = sc.nextLine();

        //判定と出力
        if (keyword.equals(str)) {
            System.out.println("入力：" + str + " キーワード:" + keyword + " 一致しました");
        } else {
            System.out.println("入力：" + str + " キーワード:" + keyword + " 不一致です");
        }
    }
}
