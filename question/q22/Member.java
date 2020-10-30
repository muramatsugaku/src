package question.q22;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

/**
 * 会員情報クラス
 */
class Member {
    private int id;
    private String name;
    private Gender gender;
    private LocalDate birthDay;

    public Member(int id, String name, Gender gender, int year, Month month,int dayOfMonth) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthDay = LocalDate.of(year,month,dayOfMonth);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender.getName();
    }

    public String getBirthDay() {
        return DateTimeFormatter.ofPattern("yyyy/MM//dd").format(birthDay);
    }

    public Long getAge() {
        return ChronoUnit.YEARS.between(birthDay, LocalDate.now());
    }
    /**
     * Memberの文字列表現
     * @return
     */
    @Override
    public String toString() {
        return String.format("%d %s %s %d",id,name,getGender(),getAge());
    }

}
