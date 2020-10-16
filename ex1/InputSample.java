package ex1;
/*
    https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/util/Scanner.html
 */
import java.util.Scanner;

public class InputSample {
    public static void main(String[] args) {
        //入力のサンプル
        Scanner in = new Scanner(System.in);
        System.out.println("数値を入力してください:");
        int num = in.nextInt();
        System.out.println("入力された値:" + num);
    }
}
