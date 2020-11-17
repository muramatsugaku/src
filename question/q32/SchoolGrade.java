package question.q32;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/*
    学級クラス
 */
class SchoolGrade {
    private int id;//クラス番号 例）1年1組 11 2年3組 23
    private List<Student> studentList;//該当クラスの学生リスト

    public SchoolGrade(int id, List<Student> studentList) {
        this.id = id;
        this.studentList = new ArrayList<>(studentList);
    }

    public int getId() {
        return id;
    }

    /**
     * 学年のゲッター
     * @return int 学年
     */
    public int getGreadeNumber() {
        return id / 10;
    }

    /**
     * クラスのゲッター
     * @return int クラス
     */
    public int getClassNumber() {
        return id % 10;
    }

    /**
     * 学生の追加
     * @param student Student クラスに追加する学生
     */
    public void addStudentList(Student student) {
        studentList.add(student);
    }

    /**
     * 国語のクラス平均を求める
     * @return double 国語のクラス平均
     */
    public double getJapAve() {
        double sum = 0,cnt = 0;
        for (Student student:studentList) {
            Optional<Integer> jap = student.getTest().map(test -> test.getJap());
            if(jap.isPresent()) cnt++;
            sum += jap.orElse(0);
        }
        if (cnt > 0){
            return sum / cnt;
        } else {
            return 0;
        }
    }

    /**
     * 数学のクラス平均を求める
     * @return double 数学のクラス平均
     */
    public double getMathAve() {
        double sum = 0,cnt = 0;
        for (Student student:studentList) {
            Optional<Integer> math = student.getTest().map(test -> test.getMath());
            if(math.isPresent()) cnt++;
            sum += math.orElse(0);
        }
        if (cnt > 0){
            return sum / cnt;
        } else {
            return 0;
        }
    }

    /**
     * 英語のクラス平均を求める
     * @return double 英語のクラス平均
     */
    public double getEngAve() {
        double sum = 0,cnt = 0;
        for (Student student:studentList) {
            Optional<Integer> eng = student.getTest().map(test -> test.getEng());
            if(eng.isPresent()) cnt++;
            sum += eng.orElse(0);
        }
        if (cnt > 0){
            return sum / cnt;
        } else {
            return 0;
        }
    }

    /**
     * デバッグ用
     * @return String インスタンスのパラメータを文字列表記
     */
    @Override
    public String toString() {
        return "SchoolGrade{" +
                "id=" + id +
                ", studentList=" + studentList +
                '}';
    }

    /**
     * CSV書き込み用
     * @return String csvの書き込みフォーマット文字列
     */
    public String toCsv() {
        return String.join(",",
                String.valueOf(id%10),
                String.format("%.2f",getJapAve()),
                String.format("%.2f",getMathAve()),
                String.format("%.2f",getEngAve()));
    }
}
