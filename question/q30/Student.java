package question.q30;

import java.util.Optional;

/*
    学生クラス
 */
class Student{
    //フィールド
    private int id;
    private String name;
    private Gender gender;
    private Test test;

    public Student(int id, String name, Gender gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public Optional<Test> getTest() {
        return Optional.ofNullable(test);
    }

    public int getGradeNumber() {
        return id / 1000;
    }

    public int getClassNumber(){
        return id / 100 % 10;
    }

    public int getNumber() {
        return id % 100;
    }

    public void setTest(Test test) {
        this.test = test;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", test=" + test +
                '}';
    }
}
