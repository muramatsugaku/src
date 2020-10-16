package ex2.figure;

/**
 * 三角形クラス
 */
class Triangle extends Figure {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return base * height / 2;
    }

    @Override
    public String toString() {
        return String.format("底辺:%.2f 高さ:%.2fの三角形の面積は%.2f",
                base,height,getArea());
    }
}
