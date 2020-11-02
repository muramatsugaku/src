package question.q25;

enum FoodType {
    MEET("Meet","肉"),
    FISH("Fish","魚");

    private String className;
    private String japaneseName;

    FoodType(String className, String japaneseName) {
        this.className = className;
        this.japaneseName = japaneseName;
    }

    public String getClassName() {
        return className;
    }

    public String getJapaneseName() {
        return japaneseName;
    }
}
