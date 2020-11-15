package ex2.streamSample;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class StreamSample2 {
    public static void main(String[] args) {
        //ArrayListの宣言
        List<String> stringList1 = List.of("apple","kiwi","cherry","dorian","plum");

        /*
            filter
            https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/util/stream/Stream.html#filter(java.util.function.Predicate)
            collect
            https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/util/stream/Stream.html#collect(java.util.stream.Collector)
         */
        List<String> filterStringList = stringList1.stream()
                .filter(s -> s.length() >= 5)//文字列の長さが5以上なら
                .collect(Collectors.toList());//listに保存

        filterStringList.forEach(System.out::println);//apple cherry dorian

        /*
            distinct
            https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/util/stream/Stream.html#distinct()
         */

        List<String> stringList2 = List.of("abc","def","abc","def","ghi");
        List<String> distinctStringList = stringList2.stream()
                .distinct()//重複を省く
                .collect(Collectors.toList());//Listに保存

        distinctStringList.forEach(System.out::println);//abc edf ghi
    }
}
