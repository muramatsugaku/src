package question.q27;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;

class Q27 {
    public static void main(String[] args) {
        String dir = System.getProperty("user.dir");
        String filePath = "\\src\\question\\q27\\data.csv";
        Path path = Paths.get(dir,filePath);
        List<Person> personList = new ArrayList<>(100);

        try {
            List<String> lines = Files.readAllLines(path);
            Pattern pattern = Pattern.compile(",");

            for (String line:lines) {
                //文字列から分割
                //String[] column = line.split(",",3);//forブロック内なので下記がおすすめ
                String[] column = pattern.split(line,3);
                //System.out.println(Arrays.toString(column));//分割された配列の確認

                //型変換
                // エラーチェックをするな正規表現を用いる（今回はしていない）
                String name = column[0];
                Gender gender = null;
                switch (column[1]) {
                    case "男":
                        gender = Gender.MEN;
                        break;
                    case "女":
                        gender = Gender.WOMEN;
                        break;
                }
                //gender = "男".equals(column[1]) ? Gender.MEN:Gender.WOMEN;
                int age = Integer.parseInt(column[2]);

                personList.add(new Person(name,gender,age));//Personインスタンスを作成してListに追加
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        //ソート・表示
        personList.sort(Collections.reverseOrder(Comparator.comparing(Person::getAge)));
        personList.forEach(System.out::println);
    }
}
