package question.q14;

/**
 * 変更
 * sum() -> getSum()
 * ave() -> getAve()
 */
class Employee {
    //フィールド
    private int id;
    private String name;
    private String gender;
    private int age;
    private  int earnings1;
    private  int earnings2;
    private  int earnings3;


    //コンストラクタ
    public Employee(int id, String name, String gender, int age, int earnings1, int earnings2, int earnings3) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.earnings1 = earnings1;
        this.earnings2 = earnings2;
        this.earnings3 = earnings3;
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

    public int getEarnings1() {
        return earnings1;
    }

    public int getEarnings2() {
        return earnings2;
    }

    public int getEarnings3() {
        return earnings3;
    }

    @Override
    public String toString() {
        return String.format("%d %s %s %d %d %d %d %d %.2f",
                id,name,gender,age,earnings1,earnings2,earnings3,getSum(),getAve());
    }



    /**
     * 売上を合計するメソッド
     * @return 3カ月の売上合計 int
     */
    public int getSum() {
        return earnings1 + earnings2 + earnings3;
    }

    /**
     * 売上の平均を求めるメソッド
     * @return　3カ月の売り上げ平均 double
     */
    public double getAve() {
        return getSum() / 3.0;
    }
}
