package proj.service;

import proj.model.Transaction;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ReportGenerator {
    public static void generateReport(List<Transaction> transactions, String outputPath) throws IOException {
        try (FileWriter writer = new FileWriter(outputPath)) {
            for (Transaction transaction : transactions) {
                writer.write(transaction.toString() + "\n");
            }
        }
    }
}
