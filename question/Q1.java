package question;

import java.util.Scanner;

/*
    キーボードから２値を入力させて、四則及び剰余演算結果を表示する
    １．キーボーﾄﾞから入力させる
    ２．四則演算および剰余演算を式付きで表示する
    ３．結果は小数点を扱う形式で表示する
 */
public class Q1 {
    public static void main(String[] args) {
        //入力の準備
        Scanner sc = new Scanner(System.in);

        //入力処理
        System.out.println("ひとつ目の数字を入力してください");
        double num1 = sc.nextDouble();
        System.out.println("ふたつ目の数字を入力してください");
        double num2 = sc.nextDouble();

        //演算と結果表示
        System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
        System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
        System.out.println(num1 + " % " + num2 + " = " + (num1%num2));

    }
}
