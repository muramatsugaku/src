package question.q18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Branch {
    private String name;
    private List<Employee> employeeList;

    {
        employeeList = new ArrayList<>();
    }

    public Branch(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getSum() {
        int sum = 0;
        for (Employee e:employeeList) {
            sum += e.getSum();
        }
        return sum;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public boolean addEmployee(Employee e) {
        return employeeList.add(e);
    }

    public List<Employee> getRanker(int num) {
        employeeList.sort(Collections.reverseOrder(Comparator.comparing(Employee::getSum)));
        List<Employee> rankerList = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            rankerList.add(employeeList.get(i));
        }
        return rankerList;
    }
}
