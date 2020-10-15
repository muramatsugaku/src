package ex2.inheritance;

class SuperClass {
    protected int num;

    public SuperClass(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public int calc() {
        return num * num;
    }
}
