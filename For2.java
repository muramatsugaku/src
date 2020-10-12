package ex1;

public class For2 {
    public static void main(String[] args) {
        //配列の処理
        double[] array = {80,40,50,100,0};

        //合計
        double sum = 0;
        for (double v:array) {
            sum += v;
        }
        System.out.println("合計:" + sum);

        //平均
        //計算の結果はオペランドの型の範囲が広い方に合わせられる
        double ave = sum / array.length;
        System.out.println("平均:" + ave);

        //最小・最大
        //仮の最小・最大
        double min = array[0];
        double max = array[0];
        for (double v:array) {
            if (min > v) {
                min = v;//最小値の更新
            }
            if (max < v) {
                max = v;//最大値の更新
            }
        }
        System.out.println("最小値:" + min);
        System.out.println("最大値:" + max);
    }
}
