package hw7.w2;

public class Main {
    public static void main(String[] args) {
        w2[] figures = new w2[5];
        figures[0] = new Triangle(34, 42, 53, 42, 33);
        figures[1] = new Rectangle(26, 66);
        figures[2] = new Circle(55);
        figures[3] = new Triangle(46, 54, 64, 54, 44);
        figures[4] = new Rectangle(33, 73);

        double totalPerimeter = 0;
        for (w2 figure : figures) {
            totalPerimeter += figure.calculatePerimeter();
        }

        System.out.println("Сумма периметров всех фигур: " + totalPerimeter);
    }
}
