package hw7;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        director.printPosition();

        Worker worker = new Worker();
        worker.printPosition();

        Accountant accountant = new Accountant();
        accountant.printPosition();
    }
}