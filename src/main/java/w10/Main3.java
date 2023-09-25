package w10;
import java.util.Arrays;
public class Main3 {

        public static void main(String[] args) {
            String inputString = "Hello, World!";
            int[] frequencyDictionary = createFrequencyDictionary(inputString);

            System.out.println("Частотный словарь: " + Arrays.toString(frequencyDictionary));
        }

        public static int[] createFrequencyDictionary(String inputString) {
            int[] frequencyDictionary = new int[26];

            for (int i = 0; i < inputString.length(); i++) {
                char letter = Character.toLowerCase(inputString.charAt(i));

                if (letter >= 'a' && letter <= 'z') { //символ является буквой английского алфавита
                    int index = letter - 'a'; //  индекс элемента в массиве frequencyDictionary

                    frequencyDictionary[index]++; // увеличиваем счетчик для данной буквы
                }
            }

            return frequencyDictionary;
        }
    }
