package ex2.setSample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class SetSample1 {
    public static void main(String[] args) {
        //宣言と初期化
        Set<Integer> integerSet = new HashSet<>();
        Collections.addAll(integerSet,10,20,30);

        //型変換
        List<Integer> integerList = new ArrayList<>();
        Collections.addAll(integerList,10,10,20,30,30);
        Set<Integer> integerSet2 = new HashSet<>(integerList);
        System.out.println(integerSet2);//10,20,30

        //追加
        integerSet.add(40);//追加されたらtrue,失敗したらfalse
        System.out.println(integerSet);//10,20,30,40
        integerSet.addAll(integerSet2);//これは追加されない
        System.out.println(integerSet);//10,20,30,40

        //削除
        integerSet.remove(20);
        System.out.println(integerSet);//10,30,40
        integerSet.removeAll(Arrays.asList(10,30,50));
        System.out.println(integerSet);//40
        integerSet.addAll(Arrays.asList(10,20,30));//復元
        integerSet.retainAll(Arrays.asList(10,30));
        System.out.println(integerSet);//10,30

        //状態
        System.out.println(integerSet.size());//要素数
        System.out.println(integerSet.isEmpty());//空判定

        //検索
        System.out.println(integerSet.contains(20));
        System.out.println(integerSet.containsAll(Arrays.asList(10, 20, 30)));
    }
}
