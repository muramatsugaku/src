package question.q10;

class Q10 {
    public static void main(String[] args) {
        Student st1 = new Student(1,"あいざわ",1,1);
        Student st2 = new Student(2,"いのうえ",2,2);
        Student st3 = new Student(3,"うえの",3,3);

        System.out.println(String.format("%d %s %d %2d",st1.getNo(),st1.getName(),st1.getGrade(),st1.getCl()));
        System.out.println(String.format("%d %s %d %2d",st2.getNo(),st2.getName(),st2.getGrade(),st2.getCl()));
        System.out.println(String.format("%d %s %d %2d",st3.getNo(),st3.getName(),st3.getGrade(),st3.getCl()));

    }
}
