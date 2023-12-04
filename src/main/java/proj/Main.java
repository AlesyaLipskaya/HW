package proj;

import proj.model.Account;
import proj.model.Transaction;
import proj.service.FileParser;
import proj.service.ReportGenerator;
import proj.service.TransactionProcessor;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите операцию:");
        System.out.println("1 - Парсинг файлов перевода");
        System.out.println("2 - Вывод списка всех переводов из файла-отчета");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                try {
                    List<Account> accounts = FileParser.parseFile("src//input//input1.txt");
                    List<Transaction> transactions = TransactionProcessor.processTransactions(accounts);
                    ReportGenerator.generateReport(transactions, "report.txt");
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case 2:
                // Логика вывода списка всех переводов из файла-отчета
                break;
            default:
                System.out.println("Неверный выбор операции");
        }
    }
}
