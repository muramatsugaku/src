package ex1;

public class ArithmeticOperator {
    public static void main(String[] args) {
        //算術演算子
        int a = 5,b = 3;
        System.out.println(a + " + " + b + " = " + (a+b));
        System.out.println(a + " - " + b + " = " + (a-b));
        System.out.println(a + " * " + b + " = " + (a*b));
        System.out.println(a + " / " + b + " = " + (a/b));
        System.out.println(a + " % " + b + " = " + (a%b));

        double c = 5,d = 3;
        System.out.println(c + " + " + d + " = " + (c+d));
        System.out.println(c + " - " + d + " = " + (c-d));
        System.out.println(c + " * " + d + " = " + (c*d));
        System.out.println(c + " / " + d + " = " + (c/d));
        System.out.println(c + " % " + d + " = " + (c%d));

        //インクリメント・デクリメント
        int e = 1,f = 2;
        e++;//e = 2
        ++f;//f = 3
        System.out.println("e:" + e);//2
        System.out.println("f:" + f);//3
        System.out.println("e++ + ++f:" + (e++ + ++f));//2+4=6
        System.out.println("e:" + e);//3
        System.out.println("f:" + f);//4

        //代入演算子
        //例 x = x + 1;
        //x += 1;　と記述できる
        int x = 1;
        System.out.println(x+=1);//2
        System.out.println(x*=10);//20
        System.out.println(x%=8);//4
    }
}
