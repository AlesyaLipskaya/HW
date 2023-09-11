package w6;

public class Calculator {

        private double weight;
        private double cost;
        private String color;

        public Calculator(double weight, double cost, String color) {
            this.weight = weight;
            this.cost = cost;
            this.color = color;
            System.out.println("Creating a Calculator object");
        }

        public double sum(double num1, double num2) {
            return num1 + num2;
        }

        public double difference(double num1, double num2) {
            return num1 - num2;
        }

        public double division(double num1, double num2) {
            if (num2 != 0) {
                return num1 / num2;
            } else {
                throw new ArithmeticException("Division by zero is not allowed.");
            }
        }

        public double multiplication(double num1, double num2) {
            return num1 * num2;
        }

        public double getWeight() {
            return weight;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }

        public double getCost() {
            return cost;
        }

        public void setCost(double cost) {
            this.cost = cost;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }
    }

