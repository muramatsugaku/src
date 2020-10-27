package ex2.stringSample;

import java.util.List;

class Data {
    private String name;
    private String gender;
    private int age;

    public Data(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d",name,gender,age);
    }
}

class MappingSample {
    public static void main(String[] args) {
        List<String> strData = List.of(
                "かとう,男,28",
                "きむら,女,31",
                "くどう,男,18",
                "けんざき,男,39",
                "こばやし,女,24"
        );


    }
}
