package ex2.enumSample;

enum Color {
    RED("赤"),
    YELLOW("青"),
    BLUE("黄");

    //フィールド
    private String jpName;
    //コンストラクタ
    private Color(String jpName) {
        this.jpName = jpName;
    }
    //ゲッター
    public String getJpName() {
        return jpName;
    }
}
