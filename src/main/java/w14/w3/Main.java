package w14.w3;

public class Main {
    public static void main(String[] args) {
        IShape square = new SquareShape();
        double squareArea = square.getSquare(5, 5);
        System.out.println("Площадь квадрата: " + squareArea);

        IShape triangle = new TriangleShape();
        double triangleArea = triangle.getSquare(4, 6);
        System.out.println("Площадь треугольника: " + triangleArea);
    }
}
