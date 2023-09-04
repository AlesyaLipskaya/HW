package hw3;
import java.util.Scanner;
    public class hw32 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int t;
            System.out.print("t = ");
            t = scanner.nextInt();
            if (t > -5)
                System.out.println("Warm");
            else if (t > -20)
                System.out.println("Normal");
            else
                System.out.println("Cold");
        }
    }
