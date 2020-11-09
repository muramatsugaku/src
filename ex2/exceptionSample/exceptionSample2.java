package ex2.exceptionSample;

class ExceptionSample2 {
    /**
     * ワードの長さを表示する
     * @param word String ワード
     */
    static void getWordLength(String word) throws Exception {
        try {
            System.out.println(word.length());
        } catch (Exception e) {
            throw new Exception("キーワードが異常です");
        }

    }

    public static void main(String[] args) {
        try {
            getWordLength("こんにちは");//5
            getWordLength(null);//ここで例外
            getWordLength("おはよう");//実行されない
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
