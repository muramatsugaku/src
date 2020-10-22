package ex2.queueSample;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

class QueueSample1 {
    public static void main(String[] args) {
        Queue<Integer> integerQueue = new LinkedList<>();

        //データの追加
        integerQueue.offer(10);
        integerQueue.offer(20);
        integerQueue.offer(30);

        //データの取得と削除
        System.out.println(integerQueue.poll());//10
        System.out.println(integerQueue.poll());//20

        //データの参照
        System.out.println(integerQueue.peek());//30
        System.out.println(integerQueue.peek());//30

        //両端キュー
        Deque<Integer> integerDeque = new LinkedList<>();

        //追加
        integerDeque.offer(0);

        //先頭から追加
        integerDeque.offerFirst(10);

        //終端から追加
        integerDeque.offerLast(20);

        //値の取得・削除
        System.out.println(integerDeque.poll());//0

        //先頭から値の取得・削除
        System.out.println(integerDeque.pollFirst());//10

        //終端から値の取得・削除
        integerDeque.offerLast(100);
        System.out.println(integerDeque.pollLast());//100

        //値の参照
        System.out.println(integerDeque.peek());//20

        //先頭から値の参照
        System.out.println(integerDeque.peekFirst());//20

        //終端から値の参照
        System.out.println(integerDeque.peekLast());//20
    }
}
