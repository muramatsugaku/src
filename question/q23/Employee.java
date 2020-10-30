package question.q23;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

class Employee {
    //フィールド
    private int id;
    private String name;
    private Gender gender;
    private LocalDate birthDay;
    private LocalTime start;
    private LocalTime end;

    /**
     * コンストラクタ
     * @param id int 従業員ID
     * @param name String 名前
     * @param gender Gender 性別
     * @param year int 誕生日の西暦
     * @param month Month 誕生日の月
     * @param dayOfMonth int 誕生日の日
     * @param startHour int 勤務開始時刻の時
     * @param startMinute int 勤務開始時刻の分
     * @param endHour int 退勤時刻の時
     * @param endMinute int 退勤時刻の分
     */
    public Employee(int id, String name, Gender gender,
                    int year, Month month, int dayOfMonth,
                    int startHour,int startMinute,
                    int endHour,int endMinute) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birthDay = LocalDate.of(year,month,dayOfMonth);
        this.start = LocalTime.of(startHour,startMinute,0);
        this.end = LocalTime.of(endHour,endMinute,0);
    }

    /**
     * 従業員IDのゲッター
     * @return String 従業員ID
     */
    public int getId() {
        return id;
    }

    /**
     * 氏名のゲッター
     * @return String 名前
     */
    public String getName() {
        return name;
    }

    /**
     * 性別の文字列表現
     * @return String 男　もしくは　女
     */
    public String getGender() {
        return gender.getName();
    }

    /**
     * 誕生日の文字列表現
     * @return String yyyy/MM//dd形式の誕生日文字列
     */
    public String getBirthDay() {
        return DateTimeFormatter.ofPattern("yyyy/MM//dd").format(birthDay);
    }

    /**
     * 年齢を返す
     * @return long 本日の年齢
     */
    public Long getAge() {
        return ChronoUnit.YEARS.between(birthDay, LocalDate.now());
    }

    /**
     * 勤務開始時刻の文字列表現
     * @return String HH:mm形式の勤務開始時刻
     */
    public String getStart() {
        return DateTimeFormatter.ofPattern("HH:mm").format(start);
    }

    /**
     * 勤務終了時刻の文字列表現
     * @return String HH:mm形式の勤務終了時刻
     */
    public String getEnd() {
        return DateTimeFormatter.ofPattern("HH:mm").format(end);
    }

    /**
     * 勤務時間を求める
     * @return Long 勤務時間（単位　分）
     */
    public Long calcWorkTime() {
        return ChronoUnit.MINUTES.between(start, end);
    }

    /**
     * 勤務時間の文字列表現
     * @return String HH:mm形式の勤務時間
     */
    public String getWorkTime() {
        int workHour = (int)(calcWorkTime() / 60);
        int workMinute = (int)(calcWorkTime() % 60);
        return DateTimeFormatter.ofPattern("HH:mm").format(LocalTime.of(workHour,workMinute,0));
    }

    /**
     * 課題に合わせた文字列表現
     * @return String 従業員番号 氏名 性別 年齢 勤務開始 勤務修了 勤務時間
     */
    @Override
    public String toString() {
        return String.format("%d %s %s %d %s %s %s",id,name,getGender(),getAge(),getStart(),getEnd(),getWorkTime());
    }
}
