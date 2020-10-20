package question.q15;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * contains版
 */
class Q15c {
    public static void main(String[] args) {
        //宣言・初期化と一覧表示
        Set<Member> memberSet = new HashSet<>();
        Collections.addAll(
                memberSet,
                new Member(1,"やまだ"),
                new Member(2,"やまだ"),
                new Member(3,"やまだ")
        );
        System.out.println(memberSet);

        //入力処理
        Scanner sc = new Scanner(System.in);
        System.out.println("IDを入力して会員情報を検索します");
        int id = sc.nextInt();

        //会員情報チェック
        if (memberSet.contains(new Member(id,""))) {
            System.out.println(String.format("id:%dの会員は登録済みです",id));
        } else {
            System.out.println(String.format("id:%dの会員は未登録です",id));
        }
    }
}
