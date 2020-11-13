package question.q30;

import java.util.Optional;

/*
    学生クラス
 */
class Student{
    //フィールド
    private int id;
    private String name;
    private Gender gender;
    private Test test;

    public Student(int id, String name, Gender gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public String getGenderName() {
        return gender.getName();
    }

    /**
     * テスト情報のゲッター
     * @return Optional<Test> テスト情報 nullの場合あり
     */
    public Optional<Test> getTest() {
        return Optional.ofNullable(test);
    }

    /**
     * 学年の取得
     * @return int 学年
     */
    public int getGradeNumber() {
        return id / 1000;
    }

    /**
     * クラスの取得
     * @return int クラス
     */
    public int getClassNumber(){
        return id / 100 % 10;
    }

    /**
     * 出席番号の取得
     * @return int 出席番号
     */
    public int getNumber() {
        return id % 100;
    }

    /**
     * テスト情報のセッター
     * @param test
     */
    public void setTest(Test test) {
        this.test = test;
    }

    /**
     * デバッグ用
     * @return String テスト情報の文字列表現
     */
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", test=" + test +
                '}';
    }
}
