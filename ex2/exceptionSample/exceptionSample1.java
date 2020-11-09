package ex2.exceptionSample;

class exceptionSample1 {
    /**
     * ワードの長さを表示する
     * @param word String ワード
     */
    static void getWordLength(String word) {
        System.out.println(word.length());
    }

    public static void main(String[] args) {
        getWordLength("こんにちは");//5
        getWordLength(null);//この時点では例外ではない
    }
}
