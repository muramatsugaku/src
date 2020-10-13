package ex2;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        //選択ソート
        int[] array = {40,10,30,50,20};
        System.out.println(Arrays.toString(array));

        System.out.println("昇順");
        for (int i = 0; i < array.length; i++) {
            int min = i;//最小値の位置
            for (int j = i+1; j < array.length ; j++) {
                if (array[min] > array[j]) {
                    min = j;//最小値の位置を更新
                    System.out.println(min);
                }
            }
            //交換
            int tmp = array[min];
            array[min] = array[i];
            array[i] = tmp;
            System.out.println(Arrays.toString(array));
        }

        System.out.println("降順");
        for (int i = 0; i < array.length; i++) {
            int max = i;//最大値の位置
            for (int j = i+1; j < array.length ; j++) {
                if (array[max] < array[j]) {
                    max = j;//最大値の位置を更新
                    System.out.println(max);
                }
            }
            //交換
            int tmp = array[max];
            array[max] = array[i];
            array[i] = tmp;
            System.out.println(Arrays.toString(array));
        }
    }
}
