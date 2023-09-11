package w6;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(10.5, 20.0, "Red");

        System.out.println("Weight: " + calculator.getWeight());
        System.out.println("Cost: " + calculator.getCost());
        System.out.println("Color: " + calculator.getColor());

        System.out.println("Sum: " + calculator.sum(5.0, 3.0));
        System.out.println("Difference: " + calculator.difference(10.0, 4.0));
        System.out.println("Division: " + calculator.division(8.0, 2.0));
        System.out.println("Multiplication: " + calculator.multiplication(2.0, 3.0));
    }
}
