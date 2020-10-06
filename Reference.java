package ex1;

public class Reference {
    public static void main(String[] args) {
        //基本型のコピー
        int i = 10;
        int j = i;
        System.out.println("i:" + i);//10
        System.out.println("j:" + j);//10
        i = 20;
        System.out.println("i:" + i);//20
        System.out.println("j:" + j);//10

        //参照型のコピー
        int[] intArray1 = {1,2,3,4,5};
        int[] intArray2 = intArray1;

        System.out.println(intArray1[0]);//1

        intArray2[0] = 10;
        System.out.println(intArray1[0]);//10

        //nullについて
        String str = "abc";
        System.out.println(str.length());//3
        str = null;
        System.out.println(str.length());//NullPointerException
    }
}
