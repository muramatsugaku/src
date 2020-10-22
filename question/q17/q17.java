package question.q17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class q17 {

    /**
     * メンバーリストに追加する
     * @param memberList List<Member> 追加するリスト
     * @param id int ID
     * @param name String 名前
     * @param gender String 性別
     * @param age int 年齢
     */
    static void addList(List<Member> memberList,int id,String name,String gender,int age) {
        memberList.add(new Member(id,name,gender,age));
    }

    /**
     * マップに変換する
     * @param memberList List<Member> 変換元List
     * @return Map<Integer,Member> 変換したMap
     */
    static Map<Integer,Member> listToMap(List<Member> memberList) {
        Map<Integer,Member> memberMap = new HashMap<>();
        for (Member m :memberList) {
            memberMap.put(m.getId(),m);
        }
        return memberMap;
    }

    public static void main(String[] args) {
        //リストの宣言と追加
        List<Member> memberList = new ArrayList<>();

        addList(memberList,1,"いまだ","男",35);
        addList(memberList,2,"かまだ","女",26);
        addList(memberList,3,"くまだ","女",43);
        addList(memberList,4,"こまだ","男",33);
        addList(memberList,5,"しまだ","女",15);
        addList(memberList,6,"たまだ","男",55);

        //処理１
        System.out.println("処理１ 一覧表示");
        for (Member member:memberList) {
            System.out.println(member);
        }

        //処理２
        System.out.println("\n処理２ 男女別表示");
        System.out.println("男性");
        for (Member member:memberList) {
            if ("男".equals(member.getGender())) System.out.println(member);
        }
        System.out.println("女性");
        for (Member member:memberList) {
            if ("女".equals(member.getGender())) System.out.println(member);
        }

        //処理３
        System.out.println("\n処理３ 年齢の降順表示");
        //memberList.sort(null);
        memberList.sort(Collections.reverseOrder(Comparator.comparing(Member::getAge)));
        for (Member member:memberList) {
            System.out.println(member);
        }

        //処理４
        System.out.println("\n処理４ IDを入力して検索");
        Scanner sc = new Scanner(System.in);
        System.out.println("検索します");
        System.out.println("IDを入力してください");
        int id = sc.nextInt();
        Map<Integer,Member> memberMap = listToMap(memberList);

        if (memberMap.containsKey(id)) {
            System.out.println(memberMap.get(id));
        } else {
            System.out.println(String.format("ID:%dの会員は見つかりませんでした",id));
        }

    }
}
