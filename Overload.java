package ex2;

public class Overload {
    static class Data {
        private String email;
        private String nickName;
        private String name;
        private String gender;

        public Data(String email, String nickName, String name, String gender) {
            this.email = email;
            this.nickName = nickName;
            this.name = name;
            this.gender = gender;
        }

        public Data(String email, String nickName) {
            this.email = email;
            this.nickName = nickName;
            this.name = "NO NAME";
            this.gender = "不明";
        }

        public String getEmail() {
            return email;
        }

        public String getNickName() {
            return nickName;
        }

        public String getName() {
            return name;
        }

        public String getGender() {
            return gender;
        }
    }

    public static void main(String[] args) {
        Data d1 = new Data("a@a.com","name","やまだ","男");
        Data d2 = new Data("b@b.com","nick");
        System.out.println(d1.getName());
        System.out.println(d2.getName());
    }
}
