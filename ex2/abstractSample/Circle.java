package ex2.abstractSample;

/**
 * 円クラス
 */
class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.pow(radius,2) * Math.PI;
    }

    @Override
    public String toString() {
        return String.format("半径:%.2fの円の面積は%.2f",
                radius,getArea());
    }
}
