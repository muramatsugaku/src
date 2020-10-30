package question.q22;

import java.time.Month;
import java.util.ArrayList;
import java.util.List;

class Q22 {
    public static void main(String[] args) {
        List<Member> memberList = new ArrayList<>();
        memberList.add(new Member(1,"いまだ",Gender.MEN,1996, Month.OCTOBER,21));
        memberList.add(new Member(2,"かまだ",Gender.WOMEN,1978, Month.APRIL,1));
        memberList.add(new Member(3,"こまだ",Gender.MEN,1988, Month.AUGUST,10));
        memberList.add(new Member(4,"しまだ",Gender.WOMEN,2005, Month.JUNE,28));
        memberList.add(new Member(5,"たまだ",Gender.MEN,1966, Month.DECEMBER,16));

        System.out.println("メンバー一覧");
        for (Member member:memberList) {
            System.out.println(member);
        }
    }
}
