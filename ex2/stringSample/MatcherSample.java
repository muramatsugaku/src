package stringSample;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


class Sample3 {
    //正規表現に一致したフレーズの出現数をカウントする
    static void regXTest(String sentence,String regX) {
        Pattern pattern = Pattern.compile(regX);
        Matcher matcher = pattern.matcher(sentence);
        int cnt = 0;
        while (matcher.find()) cnt++;
        System.out.println("検索対象:" + sentence);
        System.out.println("検索パターン:" + regX);
        System.out.println("出現回数:" + cnt);
    }

    public static void main(String[] args) {
        regXTest("にっこうこくりつこうえん","こう");
        regXTest("にっこうこくりつこうえん","こ");
        regXTest("いかたべたいかい","いか");
        regXTest("よんてんげんてんよ","よ");
    }
}
