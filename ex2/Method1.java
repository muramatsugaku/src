package ex2;

public class Method1 {
    /**
     * 加算メソッド add
     * @param x オペランド１
     * @param y オペランド２
     * @return  2値の加算結果
     */
    public static int add(int x,int y) {
        return x + y;
    }

    public static void main(String[] args) {
        //メソッドのサンプル
        System.out.println(add(10,20));//30
        //正しい呼び出し方は「クラス名.メソッド名」
        System.out.println(Method1.add(20,40));//60

    }
}
