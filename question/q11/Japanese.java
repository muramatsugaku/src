package question.q11;

class Japanese extends Human {
    public Japanese(String name) {
        super(name);
    }

    @Override
    public void hello() {
        System.out.println("こんにちは。私の名前は" + name + "。");;
    }
}
