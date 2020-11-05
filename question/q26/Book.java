package question.q26;

import java.time.LocalDate;

class Book {
    /**
     * id String 全9桁数値 ジャンル3桁 + 著者4桁 + シリアル2桁 書籍登録処理で付与
     * name String 書籍名
     * author String 著者名
     * lendingStatus boolean true 貸出されている false 貸出されてはいない 初期状態はfalse
     * lendingDate LocalDate 貸出し日 初期状態はnull
     */
    private String id;
    private String name;
    private String author;
    private boolean lendingStatus = false;
    private LocalDate lendingDate = null;

    public Book(String id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isLendingStatus() {
        return lendingStatus;
    }

    public LocalDate getLendingDate() {
        return lendingDate;
    }

    public void setLendingStatus(boolean lendingStatus) {
        this.lendingStatus = lendingStatus;
    }

    public void setLendingDate(LocalDate lendingDate) {
        this.lendingDate = lendingDate;
    }

    public void removeLendingDate() {
        this.lendingDate = null;
    }

    @Override
    public String toString() {
        return String.format("%s %s",name,author);
    }

    public String toLendList() {
        return String.format("%s %s %s %s"
                ,name,author,lendingDate,lendingDate.plusDays(7));
    }
}
