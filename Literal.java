package ex1;

public class Literal {
    public static void main(String[] args) {
        //整数リテラル
        int num1 = 123;//10進数
        int num2 = 010;//8進数
        int num3 = 0xa;//16進数
        int num4 = 0b101;//2進数

        System.out.println("整数");
        System.out.println(num1);//123
        System.out.println(num2);//8
        System.out.println(num3);//10
        System.out.println(num4);//5

        //型の明示
        long longNum = 1L;//long型のリテラル
        float floatNum = 3.14f;//float型のリテラル
        float floatNum2 = 3f;//float型のリテラル
        double doubleNum = 3.14;//デフォルトでdouble型
        double doubleNum2 = 3d;//double型のリテラル

        System.out.println("浮動小数点");
        System.out.println(longNum);//1
        System.out.println(floatNum);//3.14
        System.out.println(floatNum2);//3.0
        System.out.println(doubleNum);//3.14
        System.out.println(doubleNum2);//3.0

        //文字リテラル
        char c1 = 'A';//文字によるリテラル
        char c2 = '\u0041';//Unicodeによるリテラル
        char c3 = 65;//Unicodeを10進数で表すリテラル
        System.out.println("文字");
        System.out.println(c1);//A
        System.out.println(c2);//A
        System.out.println(c3);//A

        //エスケープシーケンス
        System.out.println("エスケープシーケンス");
        System.out.println("\"");//"
        System.out.println('\'');//'
        System.out.println("\\");//\
        System.out.println("わたしは\nねむい");//改行

        //真偽値型
        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b1);//true
        System.out.println(b2);//false
        System.out.println(!b1);//false
        System.out.println(b1&&b2);//false
        System.out.println(b1||b2);//true

        //文字列
        String str1 = "ABC";
        String str2 = "あいうえお";
        System.out.println(str1 + "の長さは" + str1.length() + "文字");
        System.out.println(str2 + "の長さは" + str2.length() + "文字");
    }
}
