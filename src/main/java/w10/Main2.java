package w10;

public class Main2 {
        public static void main(String[] args) {
            String str = "Hello";
            String str2 = "xxxx";

            StringBuilder sb = new StringBuilder(str);

            sb.append(str2);
            sb.insert(5, "y");
            sb.delete(2, 6);
            sb.reverse();

            String result = sb.toString();
            System.out.println(result);
        }
    }