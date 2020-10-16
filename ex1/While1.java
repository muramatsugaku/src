package ex1;

import javax.sound.midi.Soundbank;

public class While1 {
    public static void main(String[] args) {
        //反復命令while
        //条件が成立している間繰り返す命令
        //リニアサーチなどデータが見つかるまでの処理に向いている

        int[] array = {10,40,-30,0,100};

        int i = 0;
        while (array[i] >= 0) {
            System.out.println(array[i]);
            i++;
        }
        System.out.println("負の数が見つかった要素[" + i + "]:"+  + array[i]);

        //for命令と同じ処理もできる
        i = 0;
        while (i < array.length) {
            System.out.println("array[" + i + "]:" + array[i]);
            //i++;
        }
    }
}
