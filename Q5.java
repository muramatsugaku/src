package question;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        //入力された得点でランクをつける
        //A 80~100 B 70~79 C 60~69 D 0~59

        //入力処理
        Scanner sc = new Scanner(System.in);
        System.out.println("得点を入力してください(0-100)");
        int score = sc.nextInt();

        //判定と出力
        if (score >= 80) {
            System.out.println(score + "点 ランクA");
        } else if (score >= 70){
            System.out.println(score + "点 ランクB");
        } else if (score >= 60) {
            System.out.println(score + "点 ランクC");
        } else {
            System.out.println(score + "点 ランクD");
        }

        /*
        別解（ネスト）
        if (score >= 70) {
            if (score >= 80) {
                System.out.println(score + "点 ランクA");
            } else {
                System.out.println(score + "点 ランクB");
            }
        } else {
            if (score >= 60) {
                System.out.println(score + "点 ランクC");
            } else {
                System.out.println(score + "点 ランクD");
            }
        }
         */
    }
}
