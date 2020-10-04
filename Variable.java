public class Variable {
    public static void main(String[] args) {
        //プリミティブ（基本）変数

        //整数型
        byte b = 10;
        short s = 10;
        int i = 10;
        long l = 10L;

        //浮動小数点型
        float f = 12.34f;
        double d = 12.34;

        //文字型
        char c = 'a';

        //真偽値型
        boolean bool = true;

        //表示
        System.out.println("整数型");
        System.out.println("byte:" + b + " min:" + Byte.MIN_VALUE + " max:" + Byte.MAX_VALUE);
        System.out.println("short:" + s + " min:" + Short.MIN_VALUE + " max:" + Short.MAX_VALUE);
        System.out.println("int:" + i + " min:" + Integer.MIN_VALUE + " max:" + Integer.MAX_VALUE);
        System.out.println("long:" + l + " min:" + Long.MIN_VALUE + " max:" + Long.MAX_VALUE);
        System.out.println("浮動小数点型");
        System.out.println("float:" + f + " min:" + Float.MIN_VALUE + " max:" + Float.MAX_VALUE);
        System.out.println("doble:" + d + " min:" + Double.MIN_VALUE + " max:" + Double.MAX_VALUE);
        System.out.println("文字型");
        System.out.println("char:" + c);
        System.out.println("真偽値型");
        System.out.println("boolean:" + bool);
    }
}
