package question;

import java.util.Scanner;

/*
    身長と体重を入力してBMIを求める
    BMIの求め方
    https://keisan.casio.jp/exec/system/1161228732
 */
public class Q2 {
    public static void main(String[] args) {
        //入力の準備
        Scanner sc = new Scanner(System.in);

        //入力処理
        System.out.println("身長を入力してください(m)");
        double height = sc.nextDouble();
        System.out.println("体重を入力してください(kg)");
        double weight = sc.nextDouble();

        //計算と結果表示
        //Mathクラスのpow()メソッド
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/Math.html#pow(double,double)
        System.out.println("\n身長：" + height * 100 + "cm 体重：" + weight + "kg");
        System.out.println("BMI:" +  weight / Math.pow(height,2));
        System.out.println("適性体重：" + (Math.pow(height,2) * 22) + "kg");
        System.out.println("現在との差(" + (weight - Math.pow(height,2) * 22) + "kg)");

        //参考
        //書式付き文字列
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/String.html#format(java.lang.String,java.lang.Object...)
        System.out.println(String.format("\n身長：%.1fcm　体重：%.1fkg",height * 100,weight));
        System.out.println(String.format("BMI:%.2f",weight / Math.pow(height,2)));
        System.out.println(String.format("適性体重：%.2fkg",Math.pow(height,2) * 22));
        System.out.println(String.format("現在との差(%s%.2fkg)",weight - Math.pow(height,2) * 22 > 0 ? "+":"",weight - Math.pow(height,2) * 22));
    }
}
