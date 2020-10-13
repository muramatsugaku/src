package ex2;

public class UseEmployee {
    public static void main(String[] args) {
        //インスタンスを作る
        Employee e1 = new Employee(1,"あいざわ","男",55);
        System.out.println(e1.getId());//1
        System.out.println(e1.getName());//あいざわ
        System.out.println(e1.getGender());//男
        System.out.println(e1.getAge());//55
    }
}
