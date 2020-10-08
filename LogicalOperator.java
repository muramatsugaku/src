package ex1;

public class LogicalOperator {
    public static void main(String[] args) {
        //論理演算子
        //真偽値型を対象に演算する
        boolean t = true,f= false;

        //否定(not)
        System.out.println("!true:" + !t);//false
        System.out.println("!false:" + !f);//true

        //論理積(and)
        System.out.println("t and t:" + (t && t));//true
        System.out.println("t and f:" + (t && f));//false
        System.out.println("f and t:" + (f && t));//false
        System.out.println("f and f:" + (f && f));//false


        //論理和(or)
        System.out.println("t or t:" + (t || t));//true
        System.out.println("t or f:" + (t || f));//true
        System.out.println("f or t:" + (f || t));//true
        System.out.println("f or f:" + (f || f));//true

        //演算の優先順位は否定＞論理積＞論理和
        System.out.println((false || true && !true));//
    }
}
