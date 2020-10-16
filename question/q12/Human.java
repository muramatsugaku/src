package question.q12;
/*
    Humanクラスを継承し、hello()メソッドをそれぞれの国の言語に変更したクラスを作成しなさい
    作成クラス Japanese,French,Chinese,American
    実行クラス Q12 4つのクラスのインスタンスを作成して挨拶を表示しなさい
 */
abstract class Human {
    protected String name;

    public Human(String name) {
        this.name = name;
    }

    public abstract void hello();
}
