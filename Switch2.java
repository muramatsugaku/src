package ex1;

public class Switch2 {
    public static void main(String[] args) {
        //switch命令は数値、文字、文字列、列挙型を等価比較できる
        //String型の例を示す

        String keyword1 = "UP";

        switch (keyword1) {
            case "UP":
                System.out.println("上");
                break;
            case "DOWN":
                System.out.println("下");
                break;
            case "LEFT":
                System.out.println("左");
                break;
            case "RIGHT":
                System.out.println("右");
                break;
            default:
                System.out.println("不明");
        }

        //文字列の場合はnullだとNullPointerExceptionとなる
        //内部的にはStringクラスのequalsメソッドを使用してるため

        String keyword2 = null;

        switch (keyword2) {
            case "UP":
                System.out.println("上");
                break;
            case "DOWN":
                System.out.println("下");
                break;
            case "LEFT":
                System.out.println("左");
                break;
            case "RIGHT":
                System.out.println("右");
                break;
            default:
                System.out.println("不明");       }
    }
}
