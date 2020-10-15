package ex2.inheritance;

class SubClass extends SuperClass{
    private int num2;

    public SubClass(int num, int num2) {
        super(num);
        this.num2 = num2;
    }

    public int getNum2() {
        return num2;
    }

    @Override
    public int calc() {
        return num + num2;
    }
}
