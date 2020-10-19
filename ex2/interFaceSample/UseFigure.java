package ex2.interFaceSample;

/**
 * 図形クラスの実行
 */
class UseFigure {
    public static void main(String[] args) {
        //各図形のインスタンスを作成
        IfGetArea[] figures = {
                new Rectangle(10,20),
                new Triangle(10,20),
                new Circle(10),
        };
        //面積を求めた表示
        for (IfGetArea f:figures) {
            System.out.println(f);
        }
    }
}
