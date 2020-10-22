package ex2.genericsSample;

class GenericsClass1<T> {
    private T data;

    public GenericsClass1(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}
