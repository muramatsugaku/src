package ex2.queueSample;

import java.util.ArrayDeque;
import java.util.Deque;

class StackSample1 {
    public static void main(String[] args) {
        Deque<Integer> integerStack = new ArrayDeque<>();

        //値の追加
        integerStack.push(10);
        integerStack.push(20);
        integerStack.push(30);

        //値の取得
        System.out.println(integerStack.pop());//30
        System.out.println(integerStack.pop());//20
        System.out.println(integerStack.pop());//10

    }
}
