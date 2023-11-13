package hw19.w2;
import java.util.Arrays;

public class SortingThreads {
    public static void main(String[] args) {
        int[] array = {5, 3, 8, 2, 1, 9, 4, 6, 7};

        Thread insertionSortThread = new Thread(() -> {
            int[] insertionSortedArray = Arrays.copyOf(array, array.length);
            // Perform insertion sort on insertionSortedArray
            for (int i = 1; i < insertionSortedArray.length; i++) {
                int key = insertionSortedArray[i];
                int j = i - 1;
                while (j >= 0 && insertionSortedArray[j] > key) {
                    insertionSortedArray[j + 1] = insertionSortedArray[j];
                    j = j - 1;
                }
                insertionSortedArray[j + 1] = key;
            }
            System.out.println("Insertion sorted array: " + Arrays.toString(insertionSortedArray));
        });

        Thread selectionSortThread = new Thread(() -> {
            int[] selectionSortedArray = Arrays.copyOf(array, array.length);
            // Perform selection sort on selectionSortedArray
            for (int i = 0; i < selectionSortedArray.length - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < selectionSortedArray.length; j++) {
                    if (selectionSortedArray[j] < selectionSortedArray[minIndex]) {
                        minIndex = j;
                    }
                }
                int temp = selectionSortedArray[minIndex];
                selectionSortedArray[minIndex] = selectionSortedArray[i];
                selectionSortedArray[i] = temp;
            }
            System.out.println("Selection sorted array: " + Arrays.toString(selectionSortedArray));
        });

        Thread bubbleSortThread = new Thread(() -> {
            int[] bubbleSortedArray = Arrays.copyOf(array, array.length);
            // Perform bubble sort on bubbleSortedArray
            for (int i = 0; i < bubbleSortedArray.length - 1; i++) {
                for (int j = 0; j < bubbleSortedArray.length - i - 1; j++) {
                    if (bubbleSortedArray[j] > bubbleSortedArray[j + 1]) {
                        int temp = bubbleSortedArray[j];
                        bubbleSortedArray[j] = bubbleSortedArray[j + 1];
                        bubbleSortedArray[j + 1] = temp;
                    }
                }
            }
            System.out.println("Bubble sorted array: " + Arrays.toString(bubbleSortedArray));
        });

        insertionSortThread.start();
        selectionSortThread.start();
        bubbleSortThread.start();
    }
}
