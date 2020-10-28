package question.q20;

import java.util.HashMap;
import java.util.Map;

/*
    学生クラス
 */
class Student implements Comparable<Student> {
    //フィールド
    private int id;
    private int grade;
    private int cl;
    private int no;
    private String name;
    private Gender gender;
    private Map<Times,Test> testMap;

    //イニシャライザ
    {
        testMap = new HashMap<>();
    }

    //コンストラクタ
    public Student(int id, int grade, int cl, int no, String name, Gender gender) {
        this.id = id;
        this.grade = grade;
        this.cl = cl;
        this.no = no;
        this.name = name;
        this.gender = gender;
    }

    //ゲッター
    public int getId() {
        return id;
    }

    public int getGrade() {
        return grade;
    }

    public int getCl() {
        return cl;
    }

    public int getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    /**
     * テストのセッター
     * @param time Times 実施回
     * @param test Test テストクラスのインスタンス
     */
    public void setTestset(Times time,Test test) {
        testMap.put(time,test);
    }

    //文字列表現
    @Override
    public String toString() {
        return String.format("%d %d %d %d %s %s",id,grade,cl,no,name,gender.getName());
    }

    //比較メソッド
    //自然順設定のため
    @Override
    public int compareTo(Student o) {
        return getId() - o.getId();//Idの昇順を自然順にする
    }

    /**
     * 指定回のテストの結果表示
     * @param time
     * @return String 学年・クラス・氏名・国語の得点・数学の得点・英語の得点・3科目の合計点を文字列で返す
     */
    public String getResult(Times time) {
        Test test = testMap.get(time);
        return String.format("%d %d %s %d %d %d %d"
                ,grade,cl,name,test.getJap(),test.getMath(),test.getEng(),test.getSum());
    }

}
