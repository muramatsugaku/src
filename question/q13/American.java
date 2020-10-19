package question.q13;

class American extends Human implements IfHello {
    public American(String name) {
        super(name);
    }

    @Override
    public void hello() {
        System.out.println("Hello.My name is " + name + ".");
    }
}
