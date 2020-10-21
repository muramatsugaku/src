package ex2.mapSample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class MapSample3 {

    static void memberToMap(Map<Integer,Member> map,List<Member> memberList) {
        for (Member m:memberList) {
            map.put(m.getId(),m);
        }
    }

    public static void main(String[] args) {
        Map<Integer,Member> memberMap = new HashMap<>();
        List<Member> memberList = new ArrayList<>();
        Collections.addAll(
                memberList,
                new Member(1,"やまだ"),
                new Member(2,"たけだ"),
                new Member(3,"しまだ")
        );

        memberToMap(memberMap,memberList);

        if (memberMap.containsKey(1)) {
            //id:1が存在した
            System.out.println(memberMap.get(1));
        } else {
            System.out.println("そのIDは居ません");
        }
    }
}
