package question.q12;

class American extends Human {
    public American(String name) {
        super(name);
    }

    @Override
    public void hello() {
        System.out.println("Hello.My name is " + name + ".");
    }
}
