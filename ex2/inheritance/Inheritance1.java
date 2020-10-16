package ex2.inheritance;

class Inheritance1 {
    public static void main(String[] args) {
        SuperClass superClass = new SuperClass(10);
        System.out.println(superClass.getNum());//10
        System.out.println(superClass.calc());//100

        SubClass subClass = new SubClass(100,200);
        System.out.println(subClass.getNum());//100
        System.out.println(subClass.getNum2());//200
        System.out.println(subClass.calc());//300
    }
}
