package ex1;

public class Autoboxing {
    public static void main(String[] args) {
        //オートボクシング
        //プリミティブ型からラッパー型へ自動変換
        int intNum = 10;
        Integer integerNum = intNum;

        //アンボクシング
        //ラッパー型からプリミティブ型へ自動変換
        intNum = integerNum;

        //それぞれの明示的な変換
        //プリミティブ型からラッパー型へ
        integerNum = Integer.valueOf(intNum);
        //ラッパー型からプリミティブ型へ
        intNum = integerNum.intValue();

    }
}
