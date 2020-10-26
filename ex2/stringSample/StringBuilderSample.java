package ex2.stringSample;

import java.util.Arrays;
public class StringBuilderSample {
    public static void main(String[] args) {
        //StringBuilderを作成
        StringBuilder sb = new StringBuilder();
        String[] stringArray = {"This"," ","is"," ","a pen."};
        Arrays.stream(stringArray)//Streamに変換
                .forEach(sb::append);//StringBuilderに追加
        System.out.println(sb);
    }
}

