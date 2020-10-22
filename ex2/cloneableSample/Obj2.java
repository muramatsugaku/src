package ex2.cloneableSample;

class Obj2 implements Cloneable {
    private int num;

    public Obj2(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    //フィールドが基本型のみならこれで良い
    @Override
    public Obj2 clone() throws CloneNotSupportedException {
        return (Obj2)super.clone();
    }
}
