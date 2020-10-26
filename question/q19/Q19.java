package question.q19;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Q19 {
    public static void main(String[] args) {
        //郵便番号
        List<String> zipList = List.of(
                "064-0809",
                "12-345",
                "1b9-t123",
                "001-08015",
                "1234-678"
        );

        Pattern zipPattern = Pattern.compile("^\\d{3}-\\d{4}$");

        System.out.println("ZipCode");
        for (String zip:zipList) {
            Matcher matcher = zipPattern.matcher(zip);
            System.out.println(zip + ":" + matcher.matches());
        }

        //電話番号
        List<String> phoneNoList = List.of(
                "03-3546-7890",
                "011-684-5858",
                "093-654-0212",
                "0952-16-7549",
                "123-017-0080"
        );

        Pattern phoneNoPattern = Pattern.compile("^0\\d{1,4}-\\d{1,4}-\\d{4}$");

        System.out.println("\nPhoneNo");
        for (String phoneNo:phoneNoList) {
            Matcher matcher = phoneNoPattern.matcher(phoneNo);
            System.out.println(phoneNo + ":" + matcher.matches());
        }

        //メールアドレス
        List<String> emailList = List.of(
                "a@a.com",
                "ndfa;n;nae@safe.jp",
                "newJapan@japanese.co.jp",
                "a@@@b",
                "yamada@ace.co.jp"
        );

        Pattern emailPattern = Pattern.compile("^[a-zA-Z0-9.!#$%&'*+\\/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$");

        System.out.println("\nemail");
        for (String email:emailList) {
            Matcher matcher = emailPattern.matcher(email);
            System.out.println(email + ":" + matcher.matches());
        }
    }
}
