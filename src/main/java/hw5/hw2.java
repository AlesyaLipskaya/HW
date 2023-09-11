package hw5;

public class hw2 {
    public static void main(String[] args) {
        String[][] hw2 = new String[8][8];

        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                if ((row + col) % 2 == 0) {
                    hw2[row][col] = "W";
                } else {
                    hw2[row][col] = "B";
                }
            }
        }

        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                System.out.print(hw2[row][col] + " ");
            }
            System.out.println();
        }
    }
}

