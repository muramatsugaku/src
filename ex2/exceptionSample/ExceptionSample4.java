package ex2.exceptionSample;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


class ExceptionSample4 {
    public static void main(String[] args) {
        //相対パス指定 System.getProperty("user.dir")がカレントとなる
        Path in = Paths.get("src","ex2","exceptionSample","src.txt");
        Path out = Paths.get("src","ex2","exceptionSample","dist.txt");

        //try(AutoCloseableインターフェイスの実装クラス){
        //オープンしたリソースを自動でクローズします
        //Files https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/nio/file/Files.html
        //BufferedReader https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/io/BufferedReader.html
        //BufferedWriter https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/io/BufferedWriter.html

        try(BufferedReader bufferedReader = Files.newBufferedReader(in);
            BufferedWriter bufferedWriter = Files.newBufferedWriter(out)) {

            String line = bufferedReader.readLine();//1行読み込む
            while (line != null) {//line == null EOF(EndOfFile)
                System.out.println(line);//画面に表示
                bufferedWriter.write(line);//ファイルにlineを書き込み
                bufferedWriter.newLine();//改行を書き込み
                line = bufferedReader.readLine();//次の行を読む
            }
        } catch (IOException e) {
            e.printStackTrace();;
        }
    }
}
