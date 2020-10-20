package ex2.compalableSample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareSample {
    public static void main(String[] args) {
        //ソートの実行
        List<Employee> employeeList = new ArrayList<>();
        Collections.addAll(
                employeeList,
                new Employee(1,"あいざわ","男",55,100,400,350),
                new Employee(2,"いのうえ","女",33,200,200,200),
                new Employee(3,"うえの","男",28,400,400,400)
        );
        employeeList.sort(null);
        System.out.println(employeeList);
    }
}
