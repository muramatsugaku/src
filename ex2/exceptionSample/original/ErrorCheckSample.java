package ex2.exceptionSample.original;

import java.util.Scanner;

class ErrorCheckSample {
    /**
     * Studentクラスのインスタンスを作成する
     * バリデーションあり
     * @param name String 名前
     * @param jap int 国語の点数
     * @param math int 数学の点数
     * @param eng int 英語の点数
     * @return Student Studentインスタンス
     * @throws CreateException 作成失敗の例外
     */
    public static Student createStudent(String name,int jap,int math,int eng) throws CreateException {
        boolean nameError = false,japError = false,mathError = false,engError = false;

        if (name.isEmpty()) nameError =  true;//名前のチェック
        if (jap < 0 || jap > 100) japError = true;//国語のチェック
        if (math < 0 || math > 100) mathError = true;//数学のチェック
        if (eng < 0 || eng > 100) engError = true;//英語のチェック

        if (nameError || japError || mathError || japError) {//どれかエラーがあれば
            throw new CreateException(nameError,japError,mathError,engError);//作成時例外をスロー
        }

        return new Student(name,jap,math,eng);
    }

    public static void main(String[] args) {
        //外部からフィールドの値を入力されたイメージ
        boolean hasError = false;//入力にエラーがあればtrue
        Student student = null;//Studentインスタンスの保存用

        do {
            //各値の入力
            Scanner sc = new Scanner(System.in);
            System.out.println("名前を入力してください");
            String name = sc.nextLine();
            System.out.println("国語の得点を入力してください（1 ~ 100）");
            int jap = sc.nextInt();
            System.out.println("数学の得点を入力してください（1 ~ 100）");
            int math = sc.nextInt();
            System.out.println("英語の得点を入力してください（1 ~ 100）");
            int eng = sc.nextInt();

            //検証して問題なければインスタンス作成
            try {
                student = createStudent(name,jap,math,eng);
                hasError = false;
            } catch (CreateException e) {//作成時例外があれば
                if (e.isNameError()) System.out.println("名前が入力されていません");
                if (e.isJapError()) System.out.println("国語の得点が範囲外です");
                if (e.isMathError()) System.out.println("数がの得点が範囲外です");
                if (e.isEngError()) System.out.println("英語の得点が範囲外です");
                System.out.println("再入力してください");
                hasError = true;
            }

        } while (hasError);

        System.out.println("作成しました");
        System.out.println(student);
    }
}
