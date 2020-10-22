package ex2.genericsSample;

class GenericsSample {
    public static void main(String[] args) {
        GenericsClass1<String> stringGenericsClass1 = new GenericsClass1<>("abc");
        GenericsClass1<Integer> integerGenericsClass1 = new GenericsClass1<>(100);
    }
}
