package ex2.exceptionSample;

class Ex {
    public static Integer toInteger(String s) {
        try {
            return Integer.valueOf(s);
        } catch (NumberFormatException e) {
            System.out.println("変換できません:" + s);
            return null;
        }
    }
    public static void main(String[] args) {
        System.out.println(toInteger("123"));
        System.out.println(toInteger("abc"));
        System.out.println(toInteger("456"));
    }
}
