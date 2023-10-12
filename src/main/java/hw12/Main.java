package hw12;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String longestWord = "";
        try {
            File inputFile = new File("txt.txt");
            File outputFile = new File("txt2.txt");
            Scanner scanner = new Scanner(inputFile);
            FileWriter writer = new FileWriter(outputFile);

            while (scanner.hasNext()) {
                String word = scanner.next();
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }

            writer.write(longestWord);
            writer.close();
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Input file not found.");
        } catch (IOException e) {
            System.out.println("Error writing to output file.");
        }

        System.out.println("Longest word: " + longestWord);
    }
}
