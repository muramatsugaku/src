package ex2.setSample;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class SetSample2 {
    public static void main(String[] args) {
        Set<Integer> integerSet = new HashSet<>();
        Collections.addAll(integerSet,1,3,4,6,8,10);
        System.out.println("現在の数字:" + integerSet);

        //キーボードから入力
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        Integer input = null;

        do {
            System.out.println("Input number(1~10):");
            input = Integer.valueOf(sc.nextInt());
            flag = integerSet.add(input);
            if (flag) {
                System.out.println("登録されました");
            } else {
                System.out.println("登録済みです");
            }
        } while (!flag);

        System.out.println(integerSet);
    }
}
