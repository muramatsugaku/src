package question.q20;

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
