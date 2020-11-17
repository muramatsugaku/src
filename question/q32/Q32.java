package question.q32;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Q32 {
    /**
     * 指定の学年の成績ファイルを出力する
     * @param schoolGradeList List<schoolGrade> 学級のリスト
     * @param grade int 学年を指定
     */
    static void writegradesFile(List<SchoolGrade> schoolGradeList, int grade) {
        schoolGradeList.sort(Comparator.comparing(SchoolGrade::getId));
        Path grades = Paths.get("src", "question", "q30", "grades" + grade + ".csv");
        try (BufferedWriter bwGrades = Files.newBufferedWriter(grades)) {
            for (SchoolGrade schoolGrade:schoolGradeList) {//学級リストをリニアサーチ
                if (schoolGrade.getGreadeNumber() == grade) {//指定した学年ならば
                    bwGrades.write(schoolGrade.toCsv());//ファイルに書き込む
                    bwGrades.newLine();//改行
                }
            }
        } catch (IOException e) {
            e.printStackTrace();//入出力例外のトレース
        }
    }

    /**
     * Csv -> Student
     * @param line String 読み込んだ文字列
     * @return Student 作成したStudentインスタンス
     */
    public static Student toStudent(String line) {
        String[] column = line.split(",", 3);
        int id = Integer.valueOf(column[0]);
        String name = column[1];
        Gender gender = null;
        switch (column[2]) {
            case "男":
                gender = Gender.MEN;
                break;
            case "女":
                gender = Gender.WOMEN;
                break;
            default:
        }//マッピング終了
        return new Student(id,name,gender);
    }

    /**
     * Csv -> Test
     * @param line String 読み込んだ文字列
     * @return Test 作成したTestインスタンス
     */
    public static Test toTest(String line) {
        String[] column = line.split(",", 4);
        int id = Integer.parseInt(column[0]);
        int jap = Integer.parseInt(column[1]);
        int math = Integer.parseInt(column[2]);
        int eng = Integer.parseInt(column[3]);
        return new Test(id, jap, math, eng);
    }

    public static void main(String[] args) {
        //学生データの読み込み・Map化
        Map<Integer, Student> studentMap = new HashMap(100);
        Path studentFile = Paths.get("src", "question", "q32", "student.csv");

        try(Stream<String> lines = Files.lines(studentFile)) {
            studentMap = lines
                    .map(Q32::toStudent)
                    .collect(Collectors.toMap(student -> student.getId(),student -> student));
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("生徒データリスト");
        studentMap.values().forEach(System.out::println);//デバック用

        //テストデータの読み込み・List化
        List<Test> testList = new ArrayList<>(100);
        Path testFile = Paths.get("src", "question", "q32", "test.csv");

        try (Stream<String> lines = Files.lines(testFile)) {
            testList = lines
                    .map(Q32::toTest)
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("テストデータリスト");
        testList.forEach(System.out::println);//デバック用

        //生徒データとテストデータのマッピング
        for (Test test : testList) {
            if (studentMap.containsKey(test.getId())) {
                studentMap.get(test.getId()).setTest(test);
            }
        }

        //ファイルへの書き出し
        Map<Integer,List<Student>> gradesMap = studentMap.values().stream()
                .collect(Collectors.groupingBy(Student::getClassCode));

        //作成したgradesMapの内容確認
        gradesMap.entrySet().stream()
                .map(g -> g.getKey() + ":" + g.getValue())
                .forEach(System.out::println);

        //Mapを学級クラスのリストに変換
        List<SchoolGrade> schoolGradeList = gradesMap.entrySet().stream()
                .map(e -> new SchoolGrade(e.getKey(),e.getValue()))
                .collect(Collectors.toList());

        //学級クラスのリストを確認
        schoolGradeList.forEach(System.out::println);

    }
}