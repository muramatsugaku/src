package question.q33;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

final class Person {
    private final String id;
    private final String name;
    private final Gender gender;
    private final LocalDate birth;

    Person(String id, String name, Gender gender, LocalDate birth) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birth = birth;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public Long getAge() {
        return ChronoUnit.YEARS.between(birth, LocalDate.now());
    }

    public static Person fromCsv(String line) {
        String[] column = line.split(",",4);
        String id = column[0];
        String name = column[1];
        Gender gender = null;
        switch (column[2]) {
            case "男":
                gender = Gender.MEN;
                break;
            case "女":
                gender = Gender.WOMEN;
                break;
            default:
                //本来は例外
                gender = Gender.MEN;
        }
        LocalDate birth = LocalDate.parse(column[3]);//これも例外が発生する
        return new Person(id,name,gender,birth);
    }

    public String toCsv() {
        return String.join(",",id,name,gender.getName(),getAge().toString());
    }

    @Override
    public String toString() {
        return String.join(" ",id,name,gender.getName(),getAge().toString());
    }
}
