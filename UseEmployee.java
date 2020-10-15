package ex2;

public class UseEmployee {
    public static void main(String[] args) {
        //インスタンスを作る
        Employee e1 = new Employee(1,"あいざわ","男",55,100,400,350);
        Employee e2 = new Employee(2,"いのうえ","女",33,200,200,200);
        Employee e3 = new Employee(3,"うえの","男",28,400,400,400);

        Employee top = e1;

        if (top.sum() < e2.sum()) {
            top = e2;
        }

        if (top.sum() < e3.sum()) {
            top = e3;
        }

        System.out.println(top);

        //配列版
        Employee[] employees = {
                new Employee(1,"あいざわ","男",55,100,400,350),
                new Employee(2,"いのうえ","女",33,200,200,200),
                new Employee(3,"うえの","男",28,400,400,400),
        };

        top = employees[0];
        for (Employee employee:employees) {
            if (top.sum() < employee.sum()) {
                top = employee;
            }
        }
        System.out.println(top);
    }
}
