package question.q17;

import java.util.Objects;

/**
 * 会員情報クラス
 */
class Member implements Comparable<Member> {
    private int id;
    private String name;
    private String gender;
    private int age;

    public Member(int id, String name, String gender, int age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public int getId() {
        return id;
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

    /**
     * Memberクラスの等価性
     * IDを基準とする
     * Setの場合の等価判定に利用される
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return getId() == member.getId();
    }

    /**
     * Idを基にしたハッシュコードを求める
     * @return
     */
    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    /**
     * Memberの文字列表現
     * @return
     */
    @Override
    public String toString() {
        return String.format("%d %s %s %d",id,name,gender,age);
    }

    /**
     * 比較関数
     ** @param o
     * @return
     */
    @Override
    public int compareTo(Member o) {
        return o.age - age;
    }
}
