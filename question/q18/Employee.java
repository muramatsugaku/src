package question.q18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Employee {
    //フィールド
    private int id;
    private String name;
    private String gender;
    private int age;
    private List<Integer> earningsList;

    {
        //http://4geek.net/about-static-initializer-and-instance-initializer-on-java/
        earningsList = new ArrayList<>(12);
    };

    public Employee(int id, String name, String gender, int age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public int getSum() {
        int sum = 0;
        for(Integer earnings :earningsList) {
            sum += earnings;
        }
        return sum;
    }

    public void setEarnings(Integer... earnings) {
        earningsList.addAll(Arrays.asList(earnings));
    }

    public int getEarnings(Month month) {
        return earningsList.get(month.ordinal());
    }

    @Override
    public String toString() {
        return String.format("%s %d",name,getSum());
    }
}
