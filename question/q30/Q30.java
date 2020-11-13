package question.q30;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Q30 {
    /**
     * 指定の学年の成績ファイルを出力する
     * @param schoolGradeList List<schoolGrade> 学級のリスト
     * @param grade int 学年を指定
     */
    static void writegradesFile(List<SchoolGrade> schoolGradeList,int grade) {
        schoolGradeList.sort(Comparator.comparing(SchoolGrade::getId));//クラスidでソート
        Path grades = Paths.get("src", "question", "q30", "grades" + grade + ".csv");//ファイルパスの作成

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

    public static void main(String[] args) {
        //学生データの読み込み・Map化
        Map<Integer, Student> studentMap = new HashMap(100);//学生マップ
        Path studentFile = Paths.get("src", "question", "q30", "student.csv");//学生ファイルのパス設定

        try (BufferedReader brStudent = Files.newBufferedReader(studentFile)) {
            String line = brStudent.readLine();//1行読み込む
            while (line != null) {//ファイルが終わりでなければ
                String[] column = line.split(",", 3);//カラムに分解
                int id = Integer.valueOf(column[0]);//マッピング
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

                Student student = new Student(id, name, gender);//学生インスタンス作成
                studentMap.put(id, student);//学生マップに追加 学生番号をkey
                line = brStudent.readLine();//1行読み込む
            }
        } catch (IOException e) {
            e.printStackTrace();//入出力例外のトレース
        }

        //System.out.println("生徒データリスト");
        //studentMap.values().forEach(System.out::println);//デバック用

        //テストデータの読み込み・List化
        List<Test> testList = new ArrayList<>(100);//テストリストの作成
        Path testFile = Paths.get("src", "question", "q30", "test.csv");//テストファイルのパス設定

        try (BufferedReader brStudent = Files.newBufferedReader(testFile)) {
            String line = brStudent.readLine();//1行読み込む
            while (line != null) {//ファイルが終わりでなければ
                String[] column = line.split(",", 4);//カラムに分解
                int id = Integer.parseInt(column[0]);//マッピング
                int jap = Integer.parseInt(column[1]);
                int math = Integer.parseInt(column[2]);
                int eng = Integer.parseInt(column[3]);//マッピングここまで

                Test test = new Test(id, jap, math, eng);//テストインスタンス作成
                testList.add(test);//テストリストに追加
                line = brStudent.readLine();//1行読み込む
            }
        } catch (IOException e) {
            e.printStackTrace();//入出力例外のトレース
        }

        //System.out.println("テストデータリスト");
        //testList.forEach(System.out::println);//デバック用

        //生徒データとテストデータのマッピング
        for (Test test : testList) {
            if (studentMap.containsKey(test.getId())) {//学生マップにテストデータに登録された学生番号があれば
                studentMap.get(test.getId()).setTest(test);//学生データにテストの情報を登録
            }
        }

        //System.out.println("テストデータマッピング後の生徒データリスト");
        //studentMap.values().forEach(System.out::println);//デバック用

        //クラスごとのMap作成
        Map<Integer, SchoolGrade> schoolGradeMap = new HashMap<>();//クラスのマップ作製 クラス番号がkey

        studentMap.values().forEach(student -> {//学生情報をクラスに振り分ける
            int id = student.getId() / 100;//学生番号からクラス番号を求める
            if (!schoolGradeMap.containsKey(id)) {//クラスマップに求めたクラス番号が登録されてなければ
                schoolGradeMap.put(id, new SchoolGrade(id));//そのクラスを登録する
            }
            schoolGradeMap.get(id).addStudentList(student);//学生を該当クラスに登録する
        });

        System.out.println("クラス情報");
        schoolGradeMap.values().forEach(System.out::println);//デバック用

        //ファイルへの書き出し
        List<SchoolGrade> schoolGradeList = new ArrayList<>(schoolGradeMap.values());//クラスリストを作成
        writegradesFile(schoolGradeList,1);//1年生の処理
        writegradesFile(schoolGradeList,2);//2年生の処理
        writegradesFile(schoolGradeList,3);//3年生の処理
    }
}