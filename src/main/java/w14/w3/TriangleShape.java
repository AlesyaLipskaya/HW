package w14.w3;

public class TriangleShape implements IShape {
    @Override
    public double getSquare(int x, int y) {
        return 0.5 * x * y;
    }
}
