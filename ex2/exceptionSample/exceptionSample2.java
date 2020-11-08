package ex2.exceptionSample;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

class exceptionSample2 {
    public static void main(String[] args) {
        //ファイルの読み込みと表示
        String dir = System.getProperty("user.dir");
        System.out.println(dir);//プロジェクトフォルダまでのパス
        String filePath = "\\src\\ex2\\exceptionSample\\data.txt";
        System.out.println(dir + filePath);//処理対象ファイルまでのパス

        Path path = Paths.get(dir,filePath);//Pathオブジェクトの作成
        try {
            //ファイルを読み１行毎にリストにする
            List<String> lines = Files.readAllLines(path);
            for (String line:lines) {
                System.out.println(line);//１行の出力
            }
        } catch (IOException e) {//readAllLinesが検査例外をスローする
            //例外が発生した場合
            e.printStackTrace();//標準エラーストリームに出力
        } finally {
            //必ず実行されるブロック
            System.out.println("例外の発生に関係なく実行される");
            System.out.println("必要に応じてリソース解放の処理が来る");
        }

    }
}
