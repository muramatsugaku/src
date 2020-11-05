package question.q26;

import java.util.ArrayList;
import java.util.List;

class User {
    /**
     * id String 全9桁の数値 加入月yyyyMM +シリアル番号（3桁） 会員登録処理で自動付与のイメージ
     * name String 利用者名
     * password String パスワード
     * loginStatus boolean ログイン状態 true ログイン false ログアウト
     *
     * 追記
     * パスワードリマインダーのために生年月日も保存するのもあり
     * WEBシステムならログイン履歴情報も必要になる
     */
    private String id;
    private String name;
    private String password;
    private boolean loginStatus = false;
    private List<Book> lendList = new ArrayList<>();

    public User(String id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public boolean isLoginStatus() {
        return loginStatus;
    }

    public List<Book> getLendList() {
        return new ArrayList<>(lendList);
    }

    public void setLoginStatus(boolean loginStatus) {
        this.loginStatus = loginStatus;
    }

    public boolean addLendBook(Book book) {
        if (lendList.size() < 5) {
            lendList.add(book);
            return true;
        }
        return false;
    }

    public boolean removeLendBook(Book book) {
        if (lendList.size() > 0) {
            lendList.remove(book);
            return true;
        }
        return false;
    }

    public boolean isLend() {
        if (lendList.size() < 5) return true;
        else return false;
    }
}
