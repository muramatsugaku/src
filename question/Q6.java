package question;

public class Q6 {
    public static void main(String[] args) {
        //とある金額がある
        //最小の紙幣と硬貨で何枚になるか求めなさい
        int money = 19867;

        //金種計算
        System.out.println(money + "円");
        System.out.println("10000円:" + (money/10000) + "枚");
        money %= 10000;
        System.out.println("5000円:" + (money/5000) + "枚");
        money %= 5000;
        System.out.println("1000円:" + (money/1000) + "枚");
        money %= 1000;
        System.out.println("500円:" + (money/500) + "枚");
        money %= 500;
        System.out.println("100円:" + (money/100) + "枚");
        money %= 100;
        System.out.println("50円:" + (money/50) + "枚");
        money %= 50;
        System.out.println("10円:" + (money/10) + "枚");
        money %= 10;
        System.out.println("5円:" + (money/5) + "枚");
        money %= 5;
        System.out.println("1円:" + (money/1) + "枚");
    }
}
