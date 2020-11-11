package ex2.optionalSample;

import java.util.NoSuchElementException;
import java.util.Optional;

/*
    Optionalクラスの使い方
    https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/util/Optional.html
 */
class OptionalSample1 {
    public static void main(String[] args) {
        /*
            Optionalは値(参照)を保持するラッパーで、値を取り出すメソッドをいくつか提供する。
            値を取り出すとき、それがnullの場合の挙動が選べる。
         */

        //生成
        /*
            of(T value)
            非nullのOptionalを作成する
            NullPointerExceptionがある
         */
        Optional<String> opt1 = Optional.of("abc");
        try {
            Optional<String> opt2 = Optional.of(null);//作成されない
        } catch (NullPointerException e) {
            //e.printStackTrace();
        }

        /*
            ofNullable(T value)
            NullのOptionalも作成できる
         */
        Optional<String> opt3 = Optional.ofNullable("def");
        Optional<String> opt4 = Optional.ofNullable(null);

        /*
            empty()
            空のOptionalを生成
         */
        Optional<String> opt5 = Optional.empty();

        //値の取得
        /*
            get()
            非nullおよび空ではない値の取得
         */
        System.out.println("-----------------------------------");
        System.out.println("get()");
        System.out.println("opt1:" + opt1.get());//abc
        System.out.println("opt3:" + opt3.get());//abc
        try {
            System.out.println(opt4.get());//NoSuchElementException
        } catch (NoSuchElementException e) {
            //e.printStackTrace();
        }

        try {
            System.out.println("opt5:" + opt5.get());//NoSuchElementException
        } catch (NoSuchElementException e) {
            //e.printStackTrace();
        }

        /*
            orElse(T Other)
            nullならOtherを出力
         */
        System.out.println("-----------------------------------");
        System.out.println("orElse(T Other)");
        System.out.println("opt1:" + opt1.orElse("xyz"));
        System.out.println("opt3:" + opt3.orElse("xyz"));
        System.out.println("opt4:" + opt4.orElse("xyz"));
        System.out.println("opt5:" + opt5.orElse("xyz"));

        /*
            orElseGet(Supplier<? extends T> other)
            nullならsupplierから生成した値を返す
            supplierとは引数がなく戻り値がある関数型インターフェイスの事
         */
        System.out.println("-----------------------------------");
        System.out.println("orElseGet(Supplier<? extends T> other)");
        System.out.println("opt1:" + opt1.orElseGet(()-> null));
        System.out.println("opt3:" + opt3.orElseGet(()-> null));
        System.out.println("opt4:" + opt4.orElseGet(()-> null));
        System.out.println("opt5:" + opt5.orElseGet(()-> null));

        /*
            orElseThrow(Supplier<? extends X> exceptionSupplier)
            nullなら例外をスローする
            supplierとは引数がなく戻り値がある関数型インターフェイスの事
         */
        System.out.println("-----------------------------------");
        System.out.println("orElseThrow(Supplier<? extends X> exceptionSupplier)");
        try {
            System.out.println("opt1:" + opt1.orElseThrow(RuntimeException::new));
            System.out.println("opt3:" + opt3.orElseThrow(RuntimeException::new));
            System.out.println("opt4:" + opt4.orElseThrow(RuntimeException::new));//例外
            System.out.println("opt5:" + opt5.orElseThrow(RuntimeException::new));//例外
        } catch (RuntimeException e) {
            //e.printStackTrace();
        }

        /*
            ifPresent(Consumer<? super T> action)
            非nullなら実行される
            Consumerとは引数があり戻り値がない関数型インターフェイスの事
         */
        System.out.println("-----------------------------------");
        System.out.println("ifPresent(Consumer<? super T> action)");
        opt1.ifPresent(s-> System.out.println("opt1:" + s));//abc
        opt3.ifPresent(s-> System.out.println("opt3:" + s));//def
        opt4.ifPresent(s-> System.out.println("opt4:" + s));//実行されない
        opt5.ifPresent(s-> System.out.println("opt5:" + s));//実行されない

        /*
            filter​(Predicate<? super T> predicate)
            非nullであってPredicateの戻り値がtrueの場合値を返す
            PredicateとはBoolean型の戻り値を返す関数型インターフェイスの事
         */
        System.out.println("-----------------------------------");
        System.out.println("filter(Predicate<? super T> predicate)");
        Optional<Integer> opt6 = Optional.ofNullable(1);
        Optional<Integer> opt7 = Optional.ofNullable(5);
        Optional<Integer> opt8 = Optional.ofNullable(10);
        //System.out.println(opt6.filter(i -> i >= 5).get());//NoSuchElementException
        System.out.println(opt7.filter(i -> i >= 5).get());
        System.out.println(opt8.filter(i -> i >= 5).get());


    }
}
