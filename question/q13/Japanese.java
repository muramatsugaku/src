package question.q13;

class Japanese extends Human implements IfHello {
    public Japanese(String name) {
        super(name);
    }

    @Override
    public void hello() {
        System.out.println("こんにちは。私の名前は" + name + "。");;
    }
}
