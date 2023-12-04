package proj.service;
import proj.exception.InvalidAccountNumberException;
import proj.exception.NegativeTransferAmountException;
import proj.model.Account;
import proj.model.Transaction;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class TransactionProcessor {
    public static List<Transaction> processTransactions(List<Account> accounts) {
        List<Transaction> transactions = new ArrayList<>();

        for (Account account : accounts) {
            try {
                // Проверка на отрицательную сумму перевода
                if (account.getTransferAmount() < 0) {
                    throw new NegativeTransferAmountException("Отрицательная сумма перевода");
                }

                // Проверка на правильный формат номера счета (10 цифр)
                if (!isValidAccountNumber(account.getFromAccount()) || !isValidAccountNumber(account.getToAccount())) {
                    throw new InvalidAccountNumberException("Неверный формат номера счета");
                }

                // Простая логика обработки перевода
                int newBalance = getBalance(account.getFromAccount()) - account.getTransferAmount();
                updateBalance(account.getFromAccount(), newBalance);

                newBalance = getBalance(account.getToAccount()) + account.getTransferAmount();
                updateBalance(account.getToAccount(), newBalance);

                // Если мы добрались сюда, то перевод считается успешным
                Transaction transaction = new Transaction();
                transaction.setFileName("input1.txt"); // Замените на имя реального файла
                transaction.setStatus("успешно обработан");
                transaction.setDateTime(LocalDateTime.now());

                transactions.add(transaction);
            } catch (NegativeTransferAmountException | InvalidAccountNumberException e) {
                // Обработка ошибок
                Transaction transaction = new Transaction();
                transaction.setFileName("input1.txt"); // Замените на имя реального файла
                transaction.setStatus("ошибка во время обработки, " + e.getMessage());
                transaction.setDateTime(LocalDateTime.now());

                transactions.add(transaction);
            }
        }

        return transactions;
    }

    // Метод для проверки формата номера счета
    private static boolean isValidAccountNumber(String accountNumber) {
        return accountNumber.matches("\\d{5}-\\d{5}");
    }

    // Метод для получения баланса (заглушка, замените на реальную логику)
    private static int getBalance(String accountNumber) {
        return 1000; // Просто заглушка, замените на реальную логику
    }

    // Метод для обновления баланса (заглушка, замените на реальную логику)
    private static void updateBalance(String accountNumber, int newBalance) {
        // Обновление баланса
    }
}
