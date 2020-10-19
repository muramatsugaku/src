package question.q13;

class Chinese extends Human implements IfHello {
    public Chinese(String name) {
        super(name);
    }

    @Override
    public void hello() {
        System.out.println("你好，我的名字是" + name + "。");
    }
}
