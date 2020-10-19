package question.q13;

class French extends Human implements IfHello {
    public French(String name) {
        super(name);
    }

    @Override
    public void hello() {
        System.out.println("Bonjour, mon nom est " + name + ".");
    }
}
