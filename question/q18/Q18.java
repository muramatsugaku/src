package question.q18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Q18 {

    public static void main(String[] args) {
        //支店の作成
        Branch branch = new Branch("東京支店");

        //従業員作成
        Employee e1 = new Employee(1,"あいざわ","男",55);
        Employee e2 = new Employee(2,"いのうえ","女",33);
        Employee e3 = new Employee(3,"うえの","男",28);
        Employee e4 = new Employee(4,"えんどう","女",24);
        Employee e5 = new Employee(5,"おおた","男",43);

        //売り上げの設定
        e1.setEarnings(200,100,300,250,300,100,200,350,130,300,50,200);
        e2.setEarnings(100,120,40,200,220,90,200,360,150,100,150,200);
        e3.setEarnings(200,150,300,450,100,130,220,250,230,300,150,300);
        e4.setEarnings(220,130,300,250,300,100,200,300,130,300,180,200);
        e5.setEarnings(120,80,100,150,100,120,190,170,130,200,150,200);

        //従業員の支店への登録1
        branch.addEmployee(e1);
        branch.addEmployee(e2);
        branch.addEmployee(e3);
        branch.addEmployee(e4);
        branch.addEmployee(e5);

        //支店の売上合計
        System.out.println(String.format("%s %d",branch.getName(),branch.getSum()));

        //営業所の売上
        List<Employee> rankerList = branch.getRanker(3);
        System.out.println("\n年間売上");
        for (Employee e:rankerList) {
            System.out.println(e);
        }

        //月毎の順位
        //仮に4月の売上とする
        class MonthRank {
            private String name;
            private int earnings;

            public MonthRank(String name, int earnings) {
                this.name = name;
                this.earnings = earnings;
            }

            public String getName() {
                return name;
            }

            public int getEarnings() {
                return earnings;
            }

            @Override
            public String toString() {
                return String.format("%s %d",name,earnings);
            }
        }
        List<MonthRank> monthRankList = new ArrayList<>();
        List<Employee> employeeList = branch.getEmployeeList();

        System.out.println(String.format("\n%sの売上",Month.APRIL.getNumber()));
        for (Employee e:employeeList) {
            MonthRank monthRank = new MonthRank(e.getName(),e.getEarningsOfMonth(Month.APRIL));
            monthRankList.add(monthRank);
        }
        monthRankList.sort(Collections.reverseOrder(Comparator.comparing(MonthRank::getEarnings)));

        for (MonthRank mr:monthRankList) {
            System.out.println(mr);
        }
    }
}
