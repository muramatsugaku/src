package question.q20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Studentクラスを再構築して、次の課題を解決せよ
 * 作成するクラスはすべてパッケージプライベートとしなさい
 * １．Studentクラスには学生番号、学年、クラス、出席番号、氏名、性別、4回分のテストの成績
 * ２．Testクラスは学生番号、実施回（１～４）、国語、数学、英語の点数（０～１００）
 * ３．学生番号は学年（１～３）+クラス（１～９）+出席番号（１～９９）
 *      例　1年1組1番　1101　4桁のコード
 * ４．全生徒の一覧表示
 * ５．学年とクラスを指定してのクラス一覧表示（テストの結果は不要）
 * ６．テストの実施回を指定して成績一覧を表示（学年、クラス、氏名、3科目の結果と個人合計）
 *
 * 応用
 * ７．指定された回の3科目のクラス平均を表示（学年・クラスの昇順だと望ましい）
 */

class Q20 {
    public static void addStudentMap(Student student,Map<Integer,Student> studentMap){
        studentMap.put(student.getId(),student);
    }

    public static void setTest(Test test,Map<Integer,Student> studentMap) {
        studentMap.get(test.getId()).setTestset(test.getTime(),test);
    }

    public static void main(String[] args) {
        //データの準備
        Map<Integer,Student> studentMap = new HashMap<>();

        addStudentMap(new Student(1101,1,1,1,"相澤良太",Gender.MEN),studentMap);
        addStudentMap(new Student(1102,1,1,2,"伊藤玲奈",Gender.WOMEN),studentMap);
        addStudentMap(new Student(1201,1,2,1,"上原瑠衣",Gender.WOMEN),studentMap);
        addStudentMap(new Student(1202,1,2,2,"江原俊佑",Gender.MEN),studentMap);
        addStudentMap(new Student(1301,1,3,1,"太田光宙",Gender.MEN),studentMap);
        addStudentMap(new Student(1302,1,3,2,"金田舞曲",Gender.WOMEN),studentMap);

        //設問4　一覧表示
        List<Student> studentList = new ArrayList<>(studentMap.values());
        studentList.sort(null);
        System.out.println("課題４");
        studentList.forEach(System.out::println);

        //課題５
        //仮に1年2組にする
        int grade = 1,cl = 2;
        System.out.println("\n課題５");
        for (Student s:studentList) {
            if(s.getGrade() == grade && s.getCl() == cl) {
                System.out.println(s);
            }
        }

        //テストの成績追加（1回目）
        setTest(new Test(1101,Times.ONE,80,70,60),studentMap);
        setTest(new Test(1102,Times.ONE,100,90,90),studentMap);
        setTest(new Test(1201,Times.ONE,60,60,60),studentMap);
        setTest(new Test(1202,Times.ONE,30,40,50),studentMap);
        setTest(new Test(1301,Times.ONE,75,65,55),studentMap);
        setTest(new Test(1302,Times.ONE,85,90,95),studentMap);

        //テストの成績追加（２回目）
        setTest(new Test(1101,Times.TWO,80,80,50),studentMap);
        setTest(new Test(1102,Times.TWO,10,0,20),studentMap);
        setTest(new Test(1201,Times.TWO,60,60,60),studentMap);
        setTest(new Test(1202,Times.TWO,90,20,50),studentMap);
        setTest(new Test(1301,Times.TWO,100,100,100),studentMap);
        setTest(new Test(1302,Times.TWO,85,95,95),studentMap);

        //課題６
        //1回目
        System.out.println("\n課題６ 1回目");
        for (Student s:studentList) {
            System.out.println(s.getResult(Times.ONE));
        }

        System.out.println("\n課題６ ２回目");
        for (Student s:studentList) {
            System.out.println(s.getResult(Times.TWO));
        }





    }
}
