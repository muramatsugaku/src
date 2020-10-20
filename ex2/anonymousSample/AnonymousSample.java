package ex2.anonymousSample;

public class AnonymousSample {
    public static void main(String[] args) {
        Runnable runner = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello Lambda!");
            }
        };
        runner.run();//Hello Lambda!
    }
}
