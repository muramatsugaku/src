package question.q10;

class Student {
    //フィールド
    private int no;
    private String name;
    private int grade;
    private int cl;

    //コンストラクタ
    public Student(int no, String name, int grade, int cl) {
        this.no = no;
        this.name = name;
        this.grade = grade;
        this.cl = cl;
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
}
