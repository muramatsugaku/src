package ex2.listSample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class ListSample1 {
    public static void main(String[] args) {
        //宣言
        List<String> stringList = new ArrayList<>(100);

        //追加
        stringList.add("Tom");
        stringList.add("John");
        stringList.add("Mary");
        stringList.add(0,"James");

        //stringList.add(5,"Patricia");//IndexOutOfBoundsException
        System.out.println("追加：" + stringList);

        //すべて追加
        stringList.addAll(Arrays.asList("Bob","Jessica"));
        Collections.addAll(stringList,"Daniel","Robert");
        System.out.println("すべて追加：" + stringList);

        //変更
        stringList.set(1,"Micheal");
        stringList.set(4,"Stephanie");
        System.out.println("変更：" + stringList);

        //削除
        stringList.remove("John");
        stringList.remove(2);
        System.out.println("削除：" + stringList);
        stringList.removeAll(Arrays.asList("Bob","Jessica"));
        System.out.println("削除：" + stringList);

        //要素の参照
        System.out.println("要素の参照[0]：" + stringList.get(0));

        //現在のサイズ
        System.out.println("リストのサイズ：" + stringList.size());

        //空の判定
        System.out.println("リストが空か？:" + stringList.isEmpty());

        //部分取得
        stringList.addAll(Arrays.asList("Bob","Jessica"));
        System.out.println(stringList);
        System.out.println("[1]~[3]:" + stringList.subList(1,3));

        //配列に変換
        String[] stringArray = (String[]) stringList.toArray();

        //データが含まれているか
        System.out.println("Bobはいるか？:" + stringList.contains("Bob"));
        stringList.remove("Bob");
        System.out.println("Bobはいるか？" + stringList.contains("Bob"));//false

        //データの位置を調べる
        System.out.println("Jameは何番目？:" + stringList.indexOf("James"));//0
        System.out.println("Bobは何番目？:" + stringList.indexOf("Bob"));//-1
    }
}
