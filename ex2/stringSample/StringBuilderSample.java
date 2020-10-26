package stringSample;

import java.util.Arrays;

class StringBuilderSample {
    public static void main(String[] args) {
        //StringBuilderを作成
        StringBuilder sb = new StringBuilder();
        String[] stringArray = {"This"," ","is"," ","a pen."};
        Arrays.stream(stringArray)
                .forEach(sb::append);
        System.out.println(sb);
    }
}
