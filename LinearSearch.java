package ex2;

import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        //線形探索
        int[] array = {40,10,30,50,20};
        int searchValue = 50;//探索したい値
        int index = -1;//見つかった時のインデックス

        for (int i = 0; i < array.length; i++) {
            if (array[i] == searchValue) {
                index = i;//インデックスの保存
                break;
            }
        }

        System.out.println(Arrays.toString(array));
        System.out.println("searchValue:" + searchValue);

        if (index >= 0) {
            //見つかった時
            System.out.println(index + "の位置で見つかりました");
        } else {
            //見つからなかった時
            System.out.println("見つかりませんでした");
        }
    }
}
