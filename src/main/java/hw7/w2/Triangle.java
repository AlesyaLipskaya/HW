package hw7.w2;

public class Triangle extends w2 {
    private double base;
    private double height;
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double base, double height, double sideA, double sideB, double sideC) {
        this.base = base;
        this.height = height;
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double calculateArea() {
        return (base * height) / 2;
    }

    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }
}

