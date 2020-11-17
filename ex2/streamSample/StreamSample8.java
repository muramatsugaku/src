package ex2.streamSample;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

class StreamSample8 {
    public static void main(String[] args) {
        //DataクラスのArrayListをCSVに書き込む
        List<Data> dataList = List.of(
                new Data("101","あああ"),
                new Data("104","えええ"),
                new Data("103","かかか")
        );
        Path path = Paths.get("src","ex2","streamSample","write.csv");

        try{
            List<String> lines = dataList.stream()
                    .map(d -> d.toCsv())//DataクラスにはtoCsv()を実装
                    .collect(Collectors.toList());
            Files.write(path,lines);//例外が発生してもcoloseされるためtry()に書かない
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
