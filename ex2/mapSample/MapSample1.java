package ex2.mapSample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

class MapSample1 {
    public static void main(String[] args) {
        //宣言のみ
        Map<String,String> map1 = new HashMap<>();

        //宣言と初期化
        Map<String,String> map2 = new HashMap<>() {
            {
                put("apple","りんご");
                put("banana","バナナ");
            }
        };

        //追加
        map1.put("apple","りんご");
        map1.put("banana","バナナ");

        //表示
        System.out.println(map1);

        //キーを指定して表示
        System.out.println(map1.get("banana"));//バナナ

        //キーの有無を確認する
        System.out.println(map1.containsKey("apple"));//true
        System.out.println(map1.containsKey("orange"));//false

        //値の有無を確認する
        System.out.println(map1.containsValue("りんご"));//true
        System.out.println(map1.containsValue("オレンジ"));//false

        //値の変更
        System.out.println(map1.put("banana", "ばなな"));//バナナ
        System.out.println(map1.get("banana"));//ばなな

        //削除
        map1.remove("banana");
        System.out.println(map1);

        //キーの値のみを取得
        //keySet()はSetで返却
        map1.put("strawberry","いちご");
        Set<String> keySet = map1.keySet();
        System.out.println(keySet);

        System.out.println(map1.keySet());

        //値のみを取得
        // values()はCollectionで返却
        List<String> values = new ArrayList<>(map1.values());
        System.out.println(values);

        //キーと値をセットで取得
        for (Map.Entry<String,String> entry:map1.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
