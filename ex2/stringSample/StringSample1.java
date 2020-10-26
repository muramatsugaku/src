package ex2.stringSample;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class StringSample1 {
    public static void main(String[] args) {
        //文字列の結合 join
        List<String> list = List.of("a","b","c");
        System.out.println(String.join("",list));//abc

        //文字列の比較
        System.out.println("abc".equals("abc"));//true
        System.out.println("abc".equals("ABC"));//false
        System.out.println("abc".equals("bcd"));//false
        System.out.println("abc".compareTo("abc"));//0
        System.out.println("abc".compareTo("ABC"));//正
        System.out.println("abc".compareTo("bcd"));//負
        System.out.println("abc".equalsIgnoreCase("ABC"));//true
        System.out.println(Objects.equals(null,null));//true

        //空文字であるかを判定
        System.out.println("".isEmpty());//true
        System.out.println("   ".isBlank());//true
        System.out.println("　".isBlank());//false

        //指定した文字で始まるかを判定
        System.out.println("ピカチュー".startsWith("ピカ"));//true
        System.out.println("ピチュー".startsWith("ピカ"));//false

        //指定した文字で終わるかを判定
        System.out.println("あきこ".endsWith("こ"));//true
        System.out.println("みさと".endsWith("こ"));//false

        //文字列の長さを調べる
        System.out.println("あい123".length());//5
        System.out.println("𠀋あ𠀋".length());//5
        System.out.println("𠀋あ𠀋".codePointCount(0,"𠀋あ𠀋".length()));//3

        //アルファベットの大文字・小文字変換
        System.out.println("aBc".toUpperCase());//ABC
        System.out.println("aBc".toLowerCase());//abc

        //前後の空白を取り除く
        System.out.println(" This is a pen.    ".trim());//This is a pen.
        System.out.println(" 　This is a pen.　".strip());//This is a pen.

        //任意の位置の1文字を返す
        String str1 = "あいうえお";
        System.out.println(str1.charAt(2));//う

        //Unicodeコードポイントを返す
        System.out.println(Integer.toHexString(str1.codePointAt(0)));//3042

        //文字列の部分取得
        System.out.println(str1.substring(2,5));//うえお

        //文字列の探索
        String keyword = "うえ";
        if (str1.indexOf(keyword) >= 0) {
            System.out.println(keyword + "を" + (str1.indexOf(keyword) + 1)
                    + "文字目に見つけました");
        } else {
            System.out.println(keyword + "は存在しません");
        }

        //キーワードが何回含まれるか調べる
        String str2 = "ABCABABCAABC";
        String key = "AB";
        int fromIndex = 0,cnt = 0,find = -1;
        while (fromIndex < str2.length()) {
            find = str2.indexOf(key,fromIndex);
            //System.out.println(find);
            if (find >= 0) {
                cnt++;
                fromIndex = find + key.length();
            } else {
                break;
            }
        }
        System.out.println("探索対象:" + str2);
        System.out.println("探索キーワード:" + key);
        System.out.println(cnt + "個含まれている");

        //文字列の分割
        String data = "a,b,c,d,e";
        System.out.println(Arrays.toString(data.split(",")));
        System.out.println(Arrays.toString(data.split(",",3)));

        //文字を置き換える
        System.out.println(str2.replace("B","D"));
        System.out.println(str2.replaceAll("[AC]","Z"));

        //リピートする
        System.out.println("ねこ".repeat(10));

    }
}
