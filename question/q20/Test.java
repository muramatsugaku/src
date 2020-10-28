package question.q20;

import java.util.Objects;
/*
    テストクラス
 */
class Test implements Cloneable{
    //フィールド
    private int id;
    private Times time;
    private int jap;
    private int math;
    private int eng;

    //コンストラクタ
    public Test(int id, Times time, int jap, int math, int eng) {
        this.id = id;
        this.time = time;
        this.jap = jap;
        this.math = math;
        this.eng = eng;
    }

    //ゲッター
    public int getId() {
        return id;
    }

    public Times getTime() {
        return time;
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

    //合計点のメソッド
    public int getSum() {
        return jap + math + eng;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Test test = (Test) o;
        return getTime() == test.getTime();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTime());
    }

    //基本型とイミュータブルなフィールドしかないのでObjectクラスのclone()を利用
    @Override
    public Test clone() throws CloneNotSupportedException {
        return (Test)super.clone();
    }


}
