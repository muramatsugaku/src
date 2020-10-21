package ex2.mapSample;

import java.util.HashMap;
import java.util.Map;

class MapSample2 {
    public static void main(String[] args) {
        Map<Integer,Member> memberMap = new HashMap<>();

        memberMap.put(1,new Member(1,"やまだ"));
        memberMap.put(2,new Member(2,"たけだ"));
        memberMap.put(3,new Member(3,"しまだ"));

        if (memberMap.containsKey(1)) {
            //id:1が存在した
            System.out.println(memberMap.get(1));
        } else {
            System.out.println("そのIDは居ません");
        }
    }
}
