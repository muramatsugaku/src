package ex1;

import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {
        //配列を扱う
        int[] array = {40,10,30,50,20};
        System.out.println(Arrays.toString(array));
        System.out.println(array);//ハッシュ値が表示される

        //配列をコピーする
        int[] array2 = Arrays.copyOf(array,10);
        System.out.println(Arrays.toString(array2));

        //配列をソートする
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        //バイナリーサーチ（事前にソートが必要）
        //見つかった場所のインデックス
        System.out.println(Arrays.binarySearch(array,30));//2
        System.out.println(Arrays.binarySearch(array,0));//-1
    }
}
