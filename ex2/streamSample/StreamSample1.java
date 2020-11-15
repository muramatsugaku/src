package ex2.streamSample;

import java.util.List;
/*
    Streamのサンプル
    https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/util/stream/package-summary.html
 */
class StreamSample1 {
    public static void main(String[] args) {
        //ArrayListの宣言
        List<Integer> integerList = List.of(10,20,30,40,50);

        //リストのストリーム化 stream()
        //リストの終端操作
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/util/stream/Stream.html#forEach(java.util.function.Consumer)
        integerList.stream().forEach(System.out::println);
    }
}
