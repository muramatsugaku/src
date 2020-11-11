package question.q29;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Arrays;
import java.util.regex.Pattern;

class Q29 {
    /**
     * 従業員情報を検査する
     * @param line String 検査する文字列
     * @return String 従業員情報
     * @throws CreateEmployeeException エラー情報
     */
    public static String checkEmployee(String line) throws CreateEmployeeException {
        String[] column = line.split(",",4);//読み込んだ行を分割
        System.out.println(Arrays.toString(column));//分割した配列の表示
        boolean idError = false,nameError = false,genderError = false,birthError = false;

        if (!column[0].matches("[0-9]{7}")) idError = true;//idのエラーチェック
        if (!column[1].matches("[A-zぁ-んァ-ン一-龥]{1,20}")) nameError = true;//名前のエラーチェック
        if (!column[2].matches("[男|女]")) genderError = true;//性別のエラーチェック
        //生年月日のエラーチェック
        try {
            LocalDate.parse(column[3]);
        } catch (DateTimeParseException e) {
            birthError = true;
        }
        if(idError || nameError || genderError || birthError ) {//なにかしらのエラーがあれば
            CreateEmployeeException exception = new CreateEmployeeException(column[0]);//従業員IDを基にエラー情報作成
            if (idError) exception.addErrorList("id");//idのエラーを追加
            if (nameError) exception.addErrorList("name");//nameのエラーを追加
            if (genderError) exception.addErrorList("gender");//性別のエラーを追加//
            if (birthError) exception.addErrorList("birth");//生年月日のエラーを追加
            throw  exception;
        }
        return line;
    }

    public static void main(String[] args) {
        Path in = Paths.get("src","question","q29","employee.csv");
        Path out = Paths.get("src","question","q29","errorEmployee.csv");

        //従業員データの読み込みとオブジェクトマッピング
        try(BufferedReader bfIn = Files.newBufferedReader(in);
            BufferedWriter bwOut = Files.newBufferedWriter(out)){

            String line = bfIn.readLine();//従業員情報の読み込み
            while (line != null) {
                try {
                    checkEmployee(line);
                } catch (CreateEmployeeException e) {
                    System.out.println(e.getErrorList());//一応エラーの種類の表示
                    bwOut.write(line);//エラー情報の出力
                    bwOut.newLine();//改行
                }
                line = bfIn.readLine();//従業員情報の読み込み
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
