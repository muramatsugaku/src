package question;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        //入力値の奇遇判定をする

        //入力処理
        Scanner sc = new Scanner(System.in);
        System.out.println("数値を入力してください");
        int num = sc.nextInt();

        //判断と出力
        if (num%2 == 0) {
            System.out.println(num + "は偶数です");
        } else {
            System.out.println(num + "は奇数です");
        }

    }
}
