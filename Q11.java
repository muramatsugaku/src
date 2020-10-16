package question.q11;

class Q11 {
    public static void main(String[] args) {
        Human[] humans = {
                new Human("Tom"),
                new Japanese("ゆうき"),
                new French("Gabriel"),
                new Chinese("王")
        };

        for (Human h:humans) {
            h.hello();
        }
    }
}
