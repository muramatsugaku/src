package question.q28;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;

class Q28 {
    public static <Lits> void main(String[] args) {
        //学生リスト
        List<Student> studentList = new ArrayList<>();

        //学生データファイルのパス
        Path in = Paths.get("src","question","q28","input.txt");

        //学生データの読み込みとオブジェクトマッピング
        try(BufferedReader bfIn = Files.newBufferedReader(in)){
            Pattern pattern = Pattern.compile(",");
            String line = bfIn.readLine();
            while (line != null) {
                String[] column = pattern.split(line,4);
                System.out.println(Arrays.toString(column));
                String name = column[0];
                int jap = Integer.parseInt(column[1]);
                int math = Integer.parseInt(column[2]);
                int eng = Integer.parseInt(column[3]);
                studentList.add(new Student(name,jap,math,eng));
                line = bfIn.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        //合格者・不合格者リスト
        List<Student> passList = new ArrayList<>();
        List<Student> failureList = new ArrayList<>();

        //分類
        for(Student student:studentList) {
            if (student.isPass()) {
                passList.add(student);
            } else {
                failureList.add(student);
            }
        }

        //ソート
        passList.sort(Collections.reverseOrder(Comparator.comparing(Student::getSum)));
        failureList.sort(Comparator.comparing(Student::getSum));

        //合格者リストの出力パス
        Path pass = Paths.get("src","question","q28","pass.txt");

        //合格者のファイル出力
        try(BufferedWriter bwPass = Files.newBufferedWriter(pass)) {
            for (Student student:passList) {
                bwPass.write(student.toCsv());
                bwPass.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        //不合格者リストの出力パス
        Path failure = Paths.get("src","question","q28","failure.txt");

        //不合格者のファイル出力
        try(BufferedWriter bwfailure = Files.newBufferedWriter(failure)) {
            for (Student student:failureList) {
                bwfailure.write(student.toCsv());
                bwfailure.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
