package question.q30;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Q30 {
    public static void main(String[] args) {
        //変数の準備
        Map<Integer,Student> studentMap = new HashMap(100);
        List<Test> testList = new ArrayList<>(100);

        //学生データの読み込み・Map化
        Path studentFile = Paths.get("src","question","q30","student.csv");

        try (BufferedReader brStudent = Files.newBufferedReader(studentFile)) {

            String line = brStudent.readLine();
            while (line != null) {
                String[] column = line.split(",",3);
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
                }

                Student student = new Student(id,name,gender);
                studentMap.put(id,student);
                line = brStudent.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("生徒データリスト");
        studentMap.values().forEach(System.out::println);

        //学生データの読み込み・List化
        Path testFile = Paths.get("src","question","q30","test.csv");

        try (BufferedReader brStudent = Files.newBufferedReader(testFile)) {

            String line = brStudent.readLine();
            while (line != null) {
                String[] column = line.split(",",4);
                int id = Integer.parseInt(column[0]);
                int jap = Integer.parseInt(column[1]);
                int math = Integer.parseInt(column[2]);
                int eng = Integer.parseInt(column[3]);

                Test test = new Test(id,jap,math,eng);
                testList.add(test);
                line = brStudent.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("テストデータリスト");
        testList.forEach(System.out::println);

        //生徒データとテストデータのマッピング
        for (Test test:testList) {
            if (studentMap.containsKey(test.getId())) {
                studentMap.get(test.getId()).setTest(test);
            }
        }

        System.out.println("テストデータマッピング後の生徒データリスト");
        studentMap.values().forEach(System.out::println);
    }
}
