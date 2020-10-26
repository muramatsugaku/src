package ex2.stringSample;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class MatchesSample {
    public static void main(String[] args) {
        //基本的な正規表現比較
        String sentence = "This is a pen.";
        String regeX = "This is a .*\\.";
        System.out.println(sentence.matches(regeX));//true

        //正規表現比較を繰り返す場合
        Pattern pattern = Pattern.compile("[A-z]");//英字のみ
        List<String> sentenceList = List.of("Ab","1","ab","2a","c");

        for (String s:sentenceList) {
            Matcher matcher = pattern.matcher(s);
            System.out.println(s + ":" + matcher.matches());
        }
    }
}
