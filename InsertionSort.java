package ex2;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        //挿入ソート
        int[] array = {40,10,30,50,20};
        System.out.println(Arrays.toString(array));

        System.out.println("昇順");
        for (int i = 1; i < array.length; i++) {
            int tmp = array[i];//挿入する対象を保存
            if (tmp < array[i-1]) {
                int j = i;
                do {
                    array[j] = array[j - 1];
                    j--;
                } while (j > 0 && array[j - 1] > tmp);
                array[j] = tmp;
                System.out.println(Arrays.toString(array));
            }
        }

        System.out.println("降順");
        for (int i = 1; i < array.length; i++) {
            int tmp = array[i];//挿入する対象を保存
            if (tmp > array[i-1]) {
                int j = i;
                do {
                    array[j] = array[j - 1];
                    j--;
                } while (j > 0 && array[j - 1] < tmp);
                array[j] = tmp;
                System.out.println(Arrays.toString(array));
            }
        }
    }
}
