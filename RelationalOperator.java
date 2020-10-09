package ex1;

public class RelationalOperator {
    public static void main(String[] args) {
        //関係演算子
        //値の比較をして真偽値型の結果を求める
        int x = 10,y = 10,z = 20;

        System.out.println(x + " == " + y + ":" + (x == y));//true
        System.out.println(x + " == " + z + ":" + (x == z));//false
        System.out.println(x + " != " + y + ":" + (x != y));//false
        System.out.println(x + " != " + z + ":" + (x != z));//true
        System.out.println(x + " >= " + y + ":" + (x >= y));//true
        System.out.println(x + " >= " + z + ":" + (x >= z));//false
        System.out.println(x + " <= " + y + ":" + (x <= y));//true
        System.out.println(x + " <= " + z + ":" + (x <= z));//true
        System.out.println(x + " > " + y + ":" + (x > y));//false
        System.out.println(x + " > " + z + ":" + (x > z));//false
        System.out.println(x + " < " + y + ":" + (x < y));//false
        System.out.println(x + " < " + z + ":" + (x < z));//true
        System.out.println("A < a :" + ('A' < 'a'));//true

        //関係演算子は基本型のみ正しい比較ができる
        Integer integer1 = new Integer(10);
        Integer integer2 = new Integer(10);
        System.out.println(integer1 + " == " + integer2 +":" + (integer1 == integer2));//false

        //これは基本型として扱われる（ボクシング変換）
        integer1 = 10;
        integer2 = 10;
        System.out.println(integer1 + " == " + integer2 +":" + (integer1 == integer2));//true

        //文字列は別なインスタンスだと一致しない
        String str1 = new String("abc");
        String str2 = new String("abc");
        System.out.println(str1 + " == " + str2 +":" + (str1 == str2));//false

        //文字列は同じ文字列は同じ参照をもつので等しいことになる
        str1 = "abc";
        str2 = "abc";
        System.out.println(str1 + " == " + str2 +":" + (str1 == str2));//true

        //文字列の比較
        str1 = new String("abc");
        str2 = new String("abc");
        System.out.println("abc == str1:" + "abc".equals(str1));
        System.out.println("abc == str2:" + "abc".equals(str2));
        System.out.println("str1 == str2:" + str1.equals(str2));

    }
}
