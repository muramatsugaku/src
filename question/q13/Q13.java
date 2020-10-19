package question.q13;

class Q13 {
    public static void main(String[] args) {
        IfHello[] humans = {
                new American("Tom"),
                new Japanese("ゆうき"),
                new French("Gabriel"),
                new Chinese("王")
        };

        for (IfHello h:humans) {
            h.hello();
        }
    }
}
