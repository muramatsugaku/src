package question.q10;

/**
 * 学生クラス
 * @author Koji Moritaka
 * @version 0.0.1
 */
class Student {
    //フィールド
    private int no;
    private String name;
    private int grade;
    private int cl;
    private int jap;
    private int math;
    private int eng;

    //コンストラクタ
    public Student(int no, String name, int grade, int cl, int jap, int math, int eng) {
        this.no = no;
        this.name = name;
        this.grade = grade;
        this.cl = cl;
        this.jap = jap;
        this.math = math;
        this.eng = eng;
    }

    //ゲッター
    public int getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getCl() {
        return cl;
    }

    public int getJap() {
        return jap;
    }

    public int getMath() {
        return math;
    }

    public int getEng() {
        return eng;
    }

    @Override
    public String toString() {
        return String.format("%d-%d %d %s %d %d %d %d %.2f",
                grade,cl,no,name,jap,math,eng,sum(),ave());
    }

    /**
     * 個人合計を求める
     * @return  個人合計 int
     */
    public int sum() {
        return jap + math + eng;
    }

    /**
     * 個人平均を求める
     * @return 個人平均 double
     */
    public double ave() {
        return sum() / 3.0;
    }
}
