package ex1;

public class Break1 {
    public static void main(String[] args) {
        //負の値であれば表示を中断する処理
        int[] array = {10,20,-10,40,50};

        //while
        System.out.println("while");
        int i = 0;
        while (array[i] > 0) {
            System.out.println(array[i]);
            i++;
        }

        //for
        System.out.println("for");
        for (int j = 0; j < array.length; j++) {
            if(array[j] < 0) break;
            System.out.println(array[j]);
        }

        System.out.println("label 付き");
        //if命令とセットで使う
        //複数のブロックを終了したいときは
        //ラベルを書く

        label:for (int j = 1; j < 10; j++) {
            for (int k = 1; k < 10; k++) {
                if (j*k > 10) break label;
                System.out.println(j*k);
            }
        }
    }
}
