package question.q15;

import java.util.Objects;

/**
 * 会員情報クラス
 */
class Member implements Comparable<Member> {
    private int id;
    private String name;

    public Member(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
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
        return String.format("ID:%d %s",id,name);
    }

    /**
     * 比較関数・・・事前順の定義
     * IDの昇順を自然順とする
     * TreeSetの場合の自然順になる
     * @param o
     * @return
     */
    @Override
    public int compareTo(Member o) {
        return id - o.id;
    }
}
