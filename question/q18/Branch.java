package question.q18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Branch {
    private String name;
    private List<Employee> employeeList;

    //イニシャライザ
    {
        employeeList = new ArrayList<>();
    }

    public Branch(String name) {
        this.name = name;
    }

    public Branch(String name, List<Employee> employeeList) {
        this.name = name;
        this.employeeList = new ArrayList<>(employeeList);//安全な渡し方
    }

    public String getName() {
        return name;
    }

    /**
     * 支店の売上合計を求める
     * @return int 支店の売上合計
     */
    public int getSum() {
        int sum = 0;
        for (Employee e:employeeList) {
            sum += e.getSum();
        }
        return sum;
    }

    public List<Employee> getEmployeeList() {
        return new ArrayList<>(employeeList);//安全な渡し方
    }

    /**
     * 従業員をリストに追加する
     * @param e Employee 従業員のインスタンス
     * @return boolean 追加されたら true 失敗したら false
     */
    public boolean addEmployee(Employee e) {
        return employeeList.add(e);//clone()で渡すかイミュータブルにする
    }

    /**
     * 売り上げ上位者のリストを求める
     * @param num int リストの人数
     * @return List<Employee> 売上上位者リスト
     */
    public List<Employee> getRanker(int num) {
        employeeList.sort(Collections.reverseOrder(Comparator.comparing(Employee::getSum)));
        List<Employee> rankerList = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            rankerList.add(employeeList.get(i));
        }
        return rankerList;
    }
}
