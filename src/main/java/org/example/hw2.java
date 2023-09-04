public class hw2 {
    public static void main (String[] args) {
        System.out.println("task 1.1: " + "Alesya Lipskaya");
        int age = 22;
        System.out.println("task 1.2: "  + age + " years");
        int b = 13;
        int c = 9;
        int a = 4*(b+c-1)/2;
        System.out.println("task 2.1: " + a);
        int n = 22;
        System.out.println("task 2.2: " + (n/10 + n%10));
        int s = 666;
        System.out.println("task 2.3: " + (s/100 + s/10%10 + s%10));
        double h = 2.55;
        int hh = (int)h;
        System.out.println("task 2.4: " + hh);
        int q = 21;
        int w = 8;
        System.out.println("task 2.5: " + 21/8 + " и " + 21%8 + " в остатке");
        int r = 9;
        int t = 2;
        t = t + r;
        r = t - r;
        t = t - r;
        System.out.println("Задача 2.6: " + r + " и " + t);
    }
}