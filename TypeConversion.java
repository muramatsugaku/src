package ex1;

public class TypeConversion {
    public static void main(String[] args) {
        //ラッパークラスを用いた型変換
        //String→Integer
        Integer i1 = Integer.valueOf("1234");
        Integer i2 = Integer.valueOf("FF",16);//16進数から変換
        System.out.println(i1);
        System.out.println(i2);
        //String→Double
        Double d1 = Double.valueOf("12.34");
        System.out.println(d1);
        //Stringへ
        String s1 = i1.toString();
        String s2 = d1.toString();
    }
}
