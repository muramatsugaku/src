package question.q11;

class French extends Human {
    public French(String name) {
        super(name);
    }

    @Override
    public void hello() {
        System.out.println("Bonjour, mon nom est " + name + ".");
    }
}
