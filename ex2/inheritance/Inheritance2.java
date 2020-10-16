package ex2.inheritance;

import javax.print.attribute.Size2DSyntax;

public class Inheritance2 {
    public static void main(String[] args) {
        //スーパークラスの型の変数にサブクラスのインスタンスは格納できる
        SuperClass s1 = new SubClass(10,20);
        System.out.println(s1.getNum());//10
        System.out.println(s1.calc());//30

        SubClass s2 = (SubClass)s1;
        System.out.println(s2.getNum());//10
        System.out.println(s2.getNum2());//20
        System.out.println(s2.calc());//30

        /*
        これはコンパイルエラー
        SubClass sb1 = new SuperClass(10);
         */
        SuperClass sp1 = new SuperClass(20);
        SubClass sb2 = (SubClass)sp1;//ClassCastException
        System.out.println(sb2.getNum2());
    }
}
