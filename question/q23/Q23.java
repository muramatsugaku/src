package question.q23;

import java.time.Month;
import java.util.ArrayList;
import java.util.List;

class Q23 {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(
                1,"あいざわ",Gender.MEN,1966, Month.NOVEMBER,10,
                10,20,20,30));

        employeeList.add(new Employee(
                2,"いのうえ",Gender.WOMEN,1994, Month.JUNE,22,
                8,45,16,20));

        employeeList.add(new Employee(
                3,"うえの",Gender.MEN,2002, Month.MAY,3,
                9,00,18,00));

        for (Employee employee:employeeList) {
            System.out.println(employee);
        }
    }
}
