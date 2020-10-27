package ex2.stringSample;

import java.text.MessageFormat;

/**
 * https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/text/MessageFormat.html
 */
class MessageSample {
    public static void main(String[] args) {
        int iNum = 1000;
        double dNum = 12.3456;

        String message = MessageFormat.format("{0,number,currency}円",iNum);
        System.out.println(message);
        message = MessageFormat.format("{0,number,#.##}",dNum);
        System.out.println(message);
    }
}
