package ex2;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        //バブルソート
        int[] array = {40,10,30,50,20};
        System.out.println(Arrays.toString(array));

        System.out.println("昇順");
        for (int i = array.length-1; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                //大小関係が異なれば入れ替え
                if (array[j] > array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
                System.out.println(Arrays.toString(array));
            }
            System.out.println("-------------------------");
        }

        System.out.println("降順");
        for (int i = 0; i < array.length-1 ; i++) {
            for (int j = array.length-1; i < j; j--) {
                //大小関係が異なれば入れ替え
                if (array[j] > array[j-1]) {
                    int tmp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = tmp;
                }
                System.out.println(Arrays.toString(array));
            }
            System.out.println("-------------------------");
        }
    }
}
