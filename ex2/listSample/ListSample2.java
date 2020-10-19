package ex2.listSample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class ListSample2 {
    public static void main(String[] args) {
        //Listのソート
        List<Student> studentList = new ArrayList<>();

        //初期化
        Collections.addAll(
                studentList,
                new Student(1,"あいざわ",1,1,60,80,40),
                new Student(2,"いのうえ",2,2,20,0,40),
                new Student(3,"うえの",3,3,70,90,100)
        );

        //出力
        for (Student s:studentList) {
            System.out.println(s);
        }

        //ソート
        studentList.sort(Comparator.comparing(Student::getJap).reversed());

        //出力
        System.out.println("sort----------------------------------");
        for (Student s:studentList) {
            System.out.println(s);
        }
    }
}
