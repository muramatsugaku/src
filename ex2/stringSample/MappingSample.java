package ex2.stringSample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 今回のデータクラス
 */
class Data {
    private String name;
    private String gender;
    private int age;

    public Data(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d",name,gender,age);
    }
}

class MappingSample {
    public static void main(String[] args) {
        //文字列の元となるデータ
        List<String> strData = List.of(
                "かとう,男,28",
                "きむら,女,31",
                "くどう,男,18",
                "けんざき,男,39",
                "こばやし,女,24"
        );

        //Dataクラスのリスト
        List<Data> dataList = new ArrayList<>();

        //変換
        for (String str:strData) {
            String[] dataArray = str.split(",",-1);
            Data data = new Data(
                    dataArray[0],//name
                    dataArray[1],//gender
                    Integer.valueOf(dataArray[2])//age
            );
            dataList.add(data);
        }

        //年齢の降順で表示
        dataList.sort(Collections.reverseOrder(Comparator.comparing(Data::getAge)));
        dataList.forEach(System.out::println);
        //System.out.printf("こんにちは。私の名前は%sです。\n","やまだ");

    }
}
