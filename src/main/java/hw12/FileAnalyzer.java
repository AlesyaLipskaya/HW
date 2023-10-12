package hw12;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class FileAnalyzer {
        public static void main(String[] args) {
            File inputFile = new File("src/main/java/hw12/input.txt");
            try {
                Scanner scanner = new Scanner(inputFile);
                String longestWord = "";
                while (scanner.hasNext()) {
                    String word = scanner.next();
                    if (word.length() > longestWord.length()) {
                        longestWord = word;
                    }
                }
                scanner.close();

                File outputFile = new File("D:\\java\\idea\\HW\\src\\main\\java\\hw12\\output.txt");
                try {
                    PrintWriter writer = new PrintWriter(outputFile);
                    writer.println("Longest word: " + longestWord);
                    writer.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

