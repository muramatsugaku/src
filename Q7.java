package question;

public class Q7 {
    public static void main(String[] args) {
        //テストの得点データがある
        double[] score = {60,75,24,88,43,100,32,50,18,94};

        //平均点を求めなさい
        double sum = 0;
        for (double v:score) {
            sum += v;
        }
        double ave = sum / score.length;
        System.out.println("平均点:" + ave);

        //60点以上を合格とした場合
        //合格者の人数を求めなさい
        int cnt = 0;
        for (double v:score) {
            if (v>=60) {
                cnt++;
            }
        }
        System.out.println("合格者の人数:" + cnt);

        //合格者を対象とした平均点を求めなさい
        double passedSum = 0;
        cnt = 0;
        for (double v:score) {
            if (v>=60) {
                passedSum += v;
                cnt++;
            }
        }
        double passedAve = passedSum / cnt;
        System.out.println("合格者の平均:" + passedAve);
    }
}
