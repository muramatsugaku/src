package question.q28;

class Student {
    private String name;
    private int jap;
    private int math;
    private int eng;

    public Student(String name, int jap, int math, int eng) {
        this.name = name;
        this.jap = jap;
        this.math = math;
        this.eng = eng;
    }

    public String getName() {
        return name;
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

    /**
     * 科目合計点を求める
     * @return int 三科目の合計点
     */
    public int getSum() {
        return jap + math + eng;
    }

    @Override
    public String toString() {
        return String.format("%s %d %d %d",name,jap,math,eng);
    }

    /**
     * CSV用文字列を出力する
     * @return String CSV用文字列（カンマセパレート）
     */
    public String toCsv() {
        return String.join(",",
                name,String.valueOf(jap),String.valueOf(math),String.valueOf(eng));
    }

    /**
     * 合否判定
     * @return boolean true 合格 false 不合格
     */
    public boolean isPass() {
        return jap >= 60 && math >= 60 && eng >= 60;
    }
}
