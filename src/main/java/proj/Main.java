package proj;

import proj.model.Account;
import proj.model.Transaction;
import proj.service.FileParser;
import proj.service.ReportGenerator;
import proj.service.TransactionProcessor;
import java.time.LocalDateTime;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
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
                        List<Account> accounts = FileParser.parseFile("src/input/input1.txt");
                        List<Transaction> transactions = TransactionProcessor.processTransactions(accounts);
                        ReportGenerator.generateReport(transactions, "src/report.txt");
                    } catch (IOException e) {
                        e.printStackTrace();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    try {
                        List<Transaction> transactions = readTransactionsFromReport("report.txt");
                        printTransactions(transactions);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;
                default:
                    System.out.println("Неверный выбор операции");
            }
        }
        private static List<Transaction> readTransactionsFromReport(String reportFilePath) throws IOException {
            List<Transaction> transactions = new ArrayList<>();

            try (BufferedReader reader = new BufferedReader(new FileReader(reportFilePath))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    // Просто разбиваем строку по разделителям и создаем объект Transaction
                    String[] parts = line.split("\\|");
                    if (parts.length >= 4) {
                        Transaction transaction = new Transaction();
                        transaction.setDateTime(LocalDateTime.parse(parts[0].trim()));
                        transaction.setFileName(parts[1].trim());
                        transaction.setStatus(parts[3].trim());

                        transactions.add(transaction);
                    }
                }
            }

            return transactions;
        }
        private static void printTransactions(List<Transaction> transactions) {
            for (Transaction transaction : transactions) {
                System.out.println(transaction);
            }
        }
}