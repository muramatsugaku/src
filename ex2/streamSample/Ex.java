package ex2.streamSample;

import java.util.Arrays;
import java.util.Optional;
import java.util.OptionalDouble;

class Ex {
    public static void main(String[] args) {
        double[] score = {60,75,24,88,43,100,32,50,18,94};

        //平均点を求める
        OptionalDouble ave = Arrays.stream(score).average();
        System.out.println("平均点：" + ave.orElse(0));

        //60点以上の人数をカウントする
        long count = Arrays.stream(score)
                .filter(i -> i>=60)
                .count();
        System.out.println("合格（60点以上）の人数:" + count + "人");

        //合格者の平均点
        OptionalDouble passedAverage = Arrays.stream(score)
                .filter(i -> i>=60)
                .average();
        System.out.println("合格者の平均点：" + passedAverage.orElse(0));
    }
}
