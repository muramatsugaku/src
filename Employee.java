package ex2;

public class Employee {
    //フィールド
    private int id;
    private String name;
    private String gender;
    private int age;

    //コンストラクタ
    public Employee(int id, String name, String gender, int age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    //ゲッター
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

}
