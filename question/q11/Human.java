package question.q11;
/*
    Humanクラスを継承し、hello()メソッドをそれぞれの国の言語に変更したクラスを作成しなさい
    作成クラス Japanese,French,Chinese
    実行クラス Q11 4つのクラスのインスタンスを作成して挨拶を表示しなさい
 */
class Human {
    protected String name;

    public Human(String name) {
        this.name = name;
    }

    public void hello() {
        System.out.println("Hello.My name is " + name + ".");
    }
}
