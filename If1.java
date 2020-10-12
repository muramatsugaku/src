package ex1;

import java.util.Scanner;

public class If1 {
    public static void main(String[] args) {
        //if命令の基本
        //例　入力された数値が決められた範囲内かを調べる
        Scanner sc = new Scanner(System.in);
        int min = 1,max = 100;
        System.out.println("入力値が" + min + "~" + max + "の範囲かどうか調べます");
        System.out.println("数値を入力してください");
        int num = sc.nextInt();

        if(num >= min && num <= max) {
            //条件がtrueの場合
            System.out.println("入力値:" + num + "は" + min + "~" + max + "の範囲内です");
        } else {
            //条件がfalseの場合
            System.out.println("入力値:" + num + "は" + min + "~" + max + "の範囲外です");
        }

        if (num >= min) {
            if (num <= max) {
                System.out.println("入力値:" + num + "は" + min + "~" + max + "の範囲内です");
            } else {
                System.out.println("入力値:" + num + "は" + min + "~" + max + "の範囲外です");
            }
        } else {
            System.out.println("入力値:" + num + "は" + min + "~" + max + "の範囲外です");
        }
    }
}
