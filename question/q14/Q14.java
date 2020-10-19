package question.q14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Q14 {
    public static void main(String[] args) {
        //リスト作成・初期化
        List<Employee> employeeList = new ArrayList<>();
        Collections.addAll(
                employeeList,
                new Employee(1,"あいざわ","男",55,100,400,350),
                new Employee(2,"いのうえ","女",33,200,200,200),
                new Employee(3,"うえの","男",28,400,400,400)
        );

        //ソート
        //Collections.reverseOrder(比較関数)
        //https://qiita.com/yoshi389111/items/4211a5ea7040ec1c2f60
        employeeList.sort(Collections.reverseOrder(Comparator.comparing(Employee::getSum)));

        //表示
        for(Employee e:employeeList) {
            System.out.println(e);
        }
    }
}
