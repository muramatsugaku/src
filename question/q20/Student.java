package question.q20;

import java.sql.Time;
import java.util.HashMap;
import java.util.Map;

class Student implements Comparable<Student> {
    private int id;
    private int grade;
    private int cl;
    private int no;
    private String name;
    private Gender gender;
    private Map<Times,Test> testMap;

    {
        testMap = new HashMap<>();
    }

    public Student(int id, int grade, int cl, int no, String name, Gender gender) {
        this.id = id;
        this.grade = grade;
        this.cl = cl;
        this.no = no;
        this.name = name;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public int getGrade() {
        return grade;
    }

    public int getCl() {
        return cl;
    }

    public int getNo() {
        return no;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setTestset(Times time,Test test) {
        testMap.put(time,test);
    }

    @Override
    public String toString() {
        return String.format("%d %d %d %d %s %s",id,grade,cl,no,name,gender.getName());
    }

    @Override
    public int compareTo(Student o) {
        return getId() - o.getId();
    }

    public String getResult(Times time) {
        Test test = testMap.get(time);
        return String.format("%d %d %s %d %d %d %d"
                ,grade,cl,name,test.getJap(),test.getMath(),test.getEng(),test.getSum());
    }

}
