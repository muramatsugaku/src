package ex2.streamSample;

import java.util.Arrays;
import java.util.OptionalDouble;

class StreamSample3 {
    public static void main(String[] args) {
        //ArrayListの宣言
        int[] intArray = {1,2,3,4,5};

        /*
            skip
            https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/util/stream/Stream.html#skip(long)
            sum
            https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/util/stream/IntStream.html#sum()
         */
        int sum = Arrays.stream(intArray).
                skip(2)//3,4,5
                .sum();//12
        System.out.println(sum);//12

        /*
            limit
            https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/util/stream/Stream.html#limit(long)
            average
            https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/util/stream/IntStream.html#average()
         */
        OptionalDouble ave = Arrays.stream(intArray)
                .limit(3)//1,2,3
                .average();//2.0
        System.out.println(ave.orElse(0));
    }
}
