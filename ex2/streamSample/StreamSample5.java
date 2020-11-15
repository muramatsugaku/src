package ex2.streamSample;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class StreamSample5 {
    public static Data toData(String line) {
        String[] column = line.split(",", 2);
        return new Data(column[0],column[1]);
    }

    public static void main(String[] args) {
        Path path = Paths.get("src", "ex2", "streamSample", "data.csv");
        List<Data> dataList = new ArrayList<>();

        try (Stream<String> lines = Files.lines(path)) {
            dataList = lines
                    .map(s -> toData(s))
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }

        dataList.forEach(System.out::println);

    }
}