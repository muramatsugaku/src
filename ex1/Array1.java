package ex1;

public class Array1 {
    public static void main(String[] args) {
        //配列の宣言
        //宣言と初期化をする
        int[] array1 = {10,20,30,40,50};
        System.out.println("array1[0]:" + array1[0]);//10

        //宣言のみで初期化をしない
        int[] array2;
        // 配列のサイズを初期化しないと代入できない
        //array2[0] = 1;//コンパイルエラー
        array2 = new int[5];
        array2[0] = 1;//サイズを初期化すれば可能
        System.out.println("array2[0]:" + array1[0]);//1

        //宣言時にサイズを初期化する
        //初期値は型による
        int[] array3 = new int[5];
        System.out.println("array3[4]:" + array3[4]);//0
        double[] array4 = new double[5];
        System.out.println("array4[2]:" + array4[2]);//0.0
        char[] array5 = new char[5];
        System.out.println("array5[1]:" + array5[1]);//""

        //String型の配列ももちろんできる
        String[] array6 = {
                "あいざわ",
                "いいだ",
                null,
                "えんどう",
                "おおた",
        };

        System.out.println("array6[0]:" + array6[0]);//あいざわ
        System.out.println("array6[1]:" + array6[1]);//いいだ
        System.out.println("array6[2]:" + array6[2]);//null
        System.out.println("array6[3]:" + array6[3]);//えんどう
        System.out.println("array6[4]:" + array6[4]);//おおた

        //配列は宣言時にサイズが固定される
        //要素数を増やすことも減らすこともできない
        //添え字（インデックス）が範囲外だと例外になる
        System.out.println("array6[5]:" + array6[5]);//ArrayIndexOutOfBoundsException
    }
}
