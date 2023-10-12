package hw12;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class FileAnalyzer {
    public static void main(String[] args) {
        String inputFile = "D:\\java\\idea\\HW\\src\\main\\java\\hw12\\input.txt";
        String outputFile = "D:\\java\\idea\\HW\\src\\main\\java\\hw12\\output.txt";
        try {
            Scanner scanner = new Scanner(inputFile);
            String longestWord = "";
            while (scanner.hasNext()) {
                String word = scanner.next();
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }
            PrintWriter writer = new PrintWriter(outputFile);
            writer.println("Самое длинное слово: " + longestWord);
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e.getMessage());
        }
    }
}

