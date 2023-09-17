package hw7;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        director.printPosition();  // Вывод: Директор

        Worker worker = new Worker();
        worker.printPosition();  // Вывод: Рабочий

        Accountant accountant = new Accountant();
        accountant.printPosition();  // Вывод: Бухгалтер
    }
}