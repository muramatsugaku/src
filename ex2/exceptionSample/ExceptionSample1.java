package ex2.exceptionSample;

class ExceptionSample1 {
    /**
     * ワードの長さを表示する
     * @param word String ワード
     */
    static void getWordLength(String word) {
        try {
            //例外が発生しうる処理を記述するブロック
            System.out.println(word.length());
        } catch (Exception e) {
            //例外が発生したときに実行されるブロック
            System.out.println("キーワードが異常です");
        }

    }

    public static void main(String[] args) {
        getWordLength("こんにちは");//5
        getWordLength(null);//この時点では例外ではない
        getWordLength("おはよう");//4
    }
}
