package question.q26;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class q26 {
    /**
     * loginUserMap HashMap<String,User> ログインしているユーザーのマップ key User.id
     * booksMaps HashMap<String,Book> 書籍一覧のマップ key Book.id
     *
     * 追記
     * 将来的にはデータベースからの検索になる
     */
    private static Map<String,User> userMap = new HashMap<>();
    private static Map<String,Book> booksMap = new HashMap<>();

    /**
     * データ追加用イニシャライザ
     */
    static {
        //ユーザーの追加
        setUserMap(new User("202010001","やまだ","1234"));
        setUserMap(new User("202011001","たけだ","abcd"));

        //本の追加
        setBooksMap(new Book("001000101","わたしは愛される実験をはじめた。","浅田 悠介"));
        setBooksMap(new Book("002002002","金儲けのレシピ","事業家bot"));
        setBooksMap(new Book("003004001","♪ピンポンパンポンプー","中居正広"));
        setBooksMap(new Book("001000102","わたしは愛される実験をはじめた。２","浅田 悠介"));
        setBooksMap(new Book("002002003","金儲けのレシピ２","事業家bot"));
        setBooksMap(new Book("003004002","♪ピンポンパンポンプー２","中居正広"));

    }

    /**
     * ユーザーをマップに追加する
     * @param user User 追加するユーザーのインスタンス
     */
    private static void setUserMap(User user) {
        userMap.put(user.getId(),user);
    }

    /**
     * 本をマップに追加する
     * @param book Book 追加する本のインスタンス
     */
    private static void setBooksMap(Book book) {
        booksMap.put(book.getId(),book);
    }


    /**
     * ログイン処理
     * ログインチェックをしてログインマップに追加する
     * @param userId String ユーザID
     * @param password String パスワード
     * @return boolean ユーザーIDとパスワードチェック true ログイン成功 false ログイン失敗
     *
     */
    public static boolean isLoginCheck(String userId,String password){
        boolean logined = false;
        if (userMap.containsKey(userId)) {//userMapのユーザーIDチェック
            User user = userMap.get(userId);//ユーザー情報の取得
            logined = user.getPassword().equals(password);//パスワードチェック
            if (logined) user.setLoginStatus(true);//ログイン状態にする
        }
        return logined;//ログインの成否を返却
    }

    /**
     * 貸出機能
     * 処理手順
     * １．貸し出されていない書籍の表示
     * ２．貸出処理のメッセージを表示と書籍番号の入力（書籍番号もしくは99を入力ででメインメニューへ）
     * ２－１．入力された番号をチェックする（間違っていれば２へ）
     * ２－２．貸出しの確認のメッセージの表示（1.はい 2.いいえ）
     * ２－２－１．
     * 「1.はい」の場合は
     * 書籍の状態を「貸だされている」にする
     * 貸出日付の設定をする
     * ユーザーの貸りたリストに追加
     * ２－２－２．
     * 「2.いいえ」場合は２へ
     *
     */
    public static void lendOfBook(User loginUser) {
        System.out.println("貸出せる書籍");//見出しの表示
        List<Book> books = new ArrayList<>(booksMap.values());//書籍のリスト化
        Set<Integer> noLendSet = new HashSet<>();
        for (int i = 0; i < books.size(); i++) {
            noLendSet.add(i);//貸出されていない表示番号をセット
        }

        books.sort(Comparator.comparing(Book::getId));//書籍番号順のソート
        for (int i = 0; i < books.size() ;i++) {
            if (!books.get(i).isLendingStatus()) {
                System.out.println(i + " : " + books.get(i));//一覧の表示
            }
        }
        int operation = input("借りたい本の番号を入力してください（99 メニューへ戻る）");

        do {
            if(noLendSet.contains(operation)) {
                Book book = books.get(operation);//借りる本取得
                System.out.println(book);
                int isLend = input("この本を借りますか？ 1.はい 2.いいえ");
                if (isLend == 1) {
                    if (loginUser.isLend()) {
                        book.setLendingStatus(true);//貸出状態へ変更
                        book.setLendingDate(LocalDate.now());//貸出日付の設定
                        noLendSet.remove(operation);//貸出し対象から除外
                        loginUser.addLendBook(book);//ユーザーの貸りたリストに追加
                    } else {
                        System.out.println("これ以上借りられません");
                    }
                }
            } else {
                System.out.println("その番号の書籍はありません");
            }

            System.out.println("貸出せる書籍");//見出しの表示
            books.sort(Comparator.comparing(Book::getId));//書籍番号順のソート
            for (int i = 0; i < books.size() ;i++) {
                if (!books.get(i).isLendingStatus()) {
                    System.out.println(i + " : " + books.get(i));//一覧の表示
                }
            }
            operation = input("借りたい本の番号を入力してください（99 メニューへ戻る）");
        } while (operation != 99);
    }

    /**
     * 貸出状況確認機能
     * 処理手順
     * １．ユーザーが借りている書籍の一覧表示
     * ２．メニューへ戻るためのメッセージと入力処理（99を入力ででメインメニューへ）
     */
    public static void confirmOfLend(User loginUser) {
        List<Book> lendList = new ArrayList<>(loginUser.getLendList());
        System.out.println("借りている本のリスト");
        for (Book book:lendList) {
            System.out.println(book.toLendList());
        }
        input("0を入力でメニューに戻ります");
    }

    /**
     * 返却処理機能
     * 処理手順
     * １．ユーザーが借りている書籍の一覧表示
     * ２．返却処理を乗っセージの表示と入力処理（書籍番号もしくは99を入力ででメインメニューへ）
     * ２－１．入力された番号をチェックする（間違っていれば２へ）
     * ２－２．返却の確認のメッセージの表示（１．はい ２．いいえ）
     * ２－２－１．
     * 「1．はい」場合は
     * ユーザーの借りている本のリストから削除
     * 書籍の状態を「貸だされていない」にする
     * 書籍の貸出し日を削除
     *
     * ２－２－２．
     * 「2．返さない」場合は２へ
     */
    public static void returnOfBook(User loginUser) {
        System.out.println("返せる書籍");//見出しの表示
        List<Book> lendList = new ArrayList<>(loginUser.getLendList());//借りてる書籍のリスト化

        lendList.sort(Comparator.comparing(Book::getId));//書籍番号順のソート
        for (int i = 0; i < lendList.size() ;i++) {
                System.out.println(i + " : " + lendList.get(i));//借りてる書籍一覧の表示
        }
        int operation = input("返したい本の番号を入力してください（99 メニューへ戻る）");

        do {
            if(operation >= 0 && operation < lendList.size()) {
                Book book = lendList.get(operation);//借りる本取得
                System.out.println(book);
                int isLend = input("この本を返しますか？ 1.はい 2.いいえ");
                if (isLend == 1) {
                    book.setLendingStatus(false);//返却状態へ変更
                    book.setLendingDate(null);//貸出日付の削除
                    lendList.remove(book);//表示しているリストの変更
                    loginUser.removeLendBook(book);//ユーザーの貸りたリストから削除
                 }
            } else {
                System.out.println("その番号の書籍はありません");
            }

            System.out.println("返せる書籍");//見出しの表示
            lendList.sort(Comparator.comparing(Book::getId));//書籍番号順のソート
            for (int i = 0; i < lendList.size() ;i++) {
                System.out.println(i + " : " + lendList.get(i));//借りてる書籍一覧の表示
            }
            operation = input("返したい本の番号を入力してください（99 メニューへ戻る）");
        } while (operation != 99);

    }

    /**
     * メッセージ表示と入力値を返却するメソッド
     * @param message String 表示するメッセージ
     * @return String 選択された番号
     */
    public static int input(String message) {
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        return sc.nextInt();
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {


        //ログイン処理
        String userId = "";
        String password = "";
        boolean isLoginfailure = false;//true ログイン失敗してる false ログイン失敗してない
        do {
            if (isLoginfailure) System.out.println("利用者番号またはパスワードが違います");
            userId = Integer.toString(input("利用者番号を入力してください"));
            password = Integer.toString(input("パスワードを入力してください"));
            isLoginfailure = !isLoginCheck(userId,password);
        } while(isLoginfailure);
        System.out.println("ログインしました");

        User loginUser = userMap.get(userId);//ログインしているユーザーの設定

        //メニュー表示
        System.out.println("1.貸出");
        System.out.println("2.確認");
        System.out.println("3.返却");
        System.out.println("99.終了");

        int operator = input("実行したい処理を番号で選んでください（1 - 3 or 99）");

        do {
            switch (operator) {
                case 1:
                    lendOfBook(loginUser);
                    break;
                case 2:
                    confirmOfLend(loginUser);
                    break;
                case 3:
                    returnOfBook(loginUser);
                    break;
                default:
                    System.out.println("その番号の処理はありません");
                    break;
            }
            System.out.println("1.貸出");
            System.out.println("2.確認");
            System.out.println("3.返却");
            System.out.println("99.終了");

            operator = input("実行したい処理を番号で選んでください（1 - 3 or 99）");
        }while (operator != 99);

        //ログアウト処理


    }
}
