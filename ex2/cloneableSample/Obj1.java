package ex2.cloneableSample;

class Obj1 implements Cloneable {
    private String name;
    private int age;
    private Obj2 obj2;

    public Obj1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    /*
        1.基本的にはpublic修飾子を付け、自分自身の型を返り値とする
        2.親クラスのcloneメソッドを呼び出す(親クラスの型で返ってくるので、自分自身の型でのキャストを忘れないようにする)
        3.参照型のフィールドがある場合、そのフィールドをcloneする
     */
    @Override
    public Obj1 clone() throws CloneNotSupportedException {//1
        Obj1 b = null;
        try {
            b = (Obj1)super.clone();//2
            b.obj2 = this.obj2.clone();//3
        } catch (Exception e) {
            e.printStackTrace();
        }
        return b;
    }
}
