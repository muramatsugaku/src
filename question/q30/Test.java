package question.q30;

import java.util.Objects;

/*
    テストクラス
    immutableにしている
    1.クラスをfinalにする
    2．フィールドをfinalにする
    3．setterを作らない
 */
final class Test {
    private final int id;
    private final int jap;
    private final int math;
    private final int eng;

    public Test(int id, int jap, int math, int eng) {
        this.id = id;
        this.jap = jap;
        this.math = math;
        this.eng = eng;
    }

    public int getId() {
        return id;
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
        return "Test{" +
                "id=" + id +
                ", jap=" + jap +
                ", math=" + math +
                ", eng=" + eng +
                '}';
    }
}
