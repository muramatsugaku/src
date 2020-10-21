package question.q16;

enum Month {
    JANUARY(1,"January","睦月"),
    FEBRUARY(2,"February","如月"),
    MARCH(3,"March","弥生"),
    APRIL(4,"April","卯月"),
    MAY(5,"May","皐月"),
    JUNE(6,"June","水無月"),
    JULY(7,"July","文月"),
    AUGUST(8,"August","葉月"),
    SEPTEMBER(9,"September","長月"),
    OCTOBER(10,"October","神無月"),
    NOVEMBER(11,"November","霜月"),
    DECEMBER(12,"December","師走");

    private int number;
    private String en;
    private String jp;

    private Month(int number, String en, String jp) {
        this.number = number;
        this.en = en;
        this.jp = jp;
    }

    public int getNumber() {
        return number;
    }

    public String getEn() {
        return en;
    }

    public String getJp() {
        return jp;
    }

    @Override
    public String toString() {
        return String.format("%2d月 %s %s",number,en,jp);
    }
}
