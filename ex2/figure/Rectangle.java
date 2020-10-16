package ex2.figure;

/**
 * 長方形クラス
 */
class Rectangle extends Figure{
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return String.format("高さ:%.2f,幅:%.2fの長方形の面積は%.2f",
                height,width,getArea());
    }
}
