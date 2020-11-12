package question.q30;
/*
    性別を表す列挙型
 */
enum Gender {
    MEN("男"),
    WOMEN("女");

    private String name;

    private Gender(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
