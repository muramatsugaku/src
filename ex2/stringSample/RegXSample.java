package stringSample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

class RegXSample {
    public static void main(String[] args) {
        //正規表現パターンの作成
        Pattern zip = Pattern.compile("^\\d{3}-\\d{4}$");
        //郵便番号リスト
        List<String> zipList = new ArrayList<>();
        Collections.addAll(zipList,"064-0809","12-345","1b9-t123");
        //検査する
        zipList.forEach(s -> {
                    if (zip.matcher(s).matches()) {
                        System.out.println(s + ":true");
                    } else {
                        System.out.println(s + ":false");
                    }
                });
    }
}
