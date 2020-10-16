package ex1;

public class For1 {
    public static void main(String[] args) {
        //反復命令for
        //配列を処理するときに親和性が高い。

        //基本の文法
        //1~10まで1づつ変化させる
        for (int i = 1; i <= 10; i++) {
            System.out.println("i:" + i);
        }

        //活用例
        //配列の表示
        //array.length 配列の要素数 この例では5
        int[] array = {100,40,20,60,80};
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "]:" + array[i]);
        }

        double[] array2 = {22.4,-10.5,0.25};
        for (int i = 0; i < array2.length; i++) {
            System.out.println("array2[" + i + "]:" + array2[i]);
        }

        //拡張for命令(foreach)
        //さらに配列用の記述がある
        //int value 値を取り出す変数（配列と同じ型であること）
        //:を書いて配列名を書く
        for (int value:array) {
            System.out.println(value);
        }
    }
}
