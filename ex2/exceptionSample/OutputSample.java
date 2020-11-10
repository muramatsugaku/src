package ex2.exceptionSample;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

class Data {
    private String name;
    private String gender;
    private int age;

    public Data(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Data{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }

    /**
     * CSV用の文字列を返す
     * @return String カンマで区切られた文字列
     */
    public String toCsv() {
        return String.join(",",name,gender,String.valueOf(age));
    }
}

class OutputSample {
    //インスタンスを文字列として保存する
    public static void main(String[] args) {
        List<Data> dataList = new ArrayList<>();
        dataList.add(new Data("あいざわ","男",28));
        dataList.add(new Data("いのうえ","女",31));
        dataList.add(new Data("うえの","男",40));

        Path out = Paths.get("src","ex2","exceptionSample","dataList.txt");

        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(out)) {
            for (Data data:dataList) {
                String line = data.toCsv();//オブジェクトからCSVに変換
                bufferedWriter.write(line);//ファイルにlineを書き込み
                bufferedWriter.newLine();//改行を書き込み
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
