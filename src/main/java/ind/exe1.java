package ind;
import java.util.Scanner;
public class exe1 {
    static Scanner scan = new Scanner(System.in);
    public static void main (String[] args) {
        // ввести свое имя, фамилию и возраст
        System.out.println( "Введите свое имя: ");
        String name = scan.nextLine();
        System.out.println("Имя пользователя: " + name);
        System.out.println( "Введите свою фамилию: ");
        String surname = scan.nextLine();
        System.out.println("Фамилия пользователя: " + surname);
        System.out.println( "Введите свой возраст: ");
        String age = scan.nextLine();
        System.out.println("Возраст пользователя: " + age);
        System.out.println("Данные записаны:");
        System.out.println("Имя: " + name);
        System.out.println("Фамилия: " + surname);
        System.out.println("Возраст: " + age);

        // Написать приложение, которое будет вычислять и выводить значение по формуле: a=4*(b+c-1)/2; b и c задаем в коде самостоятельно
        System.out.println("найдем чему равна а по формуле a=4*(b+c-1)/2: ");
        int a;
        System.out.println("введите значение b: ");
        int b = Integer.parseInt(scan.nextLine());
        System.out.println("введите значение с: ");
        int c = Integer.parseInt(scan.nextLine());
        a = 4*(b+c-1)/2;
        System.out.println("значение а исходя из заданных данных равняется: " + a);

        //В переменной n хранится !!!!!ДВУХЗНАЧНОЕ число. Создайте программу, вычисляющую и выводящую на экран сумму цифр n. Например: n =26, в результате мы должны получить 8 (2+6)
        System.out.println("введите !!!!!ДВУХЗНАЧНОЕ ЧИСЛО!!!! = значение n: ");
        int n = Integer.parseInt(scan.nextLine());
        System.out.println("Вывести сумму цифр данного числа: ");
        int sum = 0;
       sum += n % 10; // Получаем последнюю цифру числа и добавляем ее к сумме
        n /= 10; // Удаляем последнюю цифру числа
        sum += n; // Добавляем оставшуюся цифру к сумме
        System.out.println("Сумма цифр числа равна " + sum);

        //В переменной n хранится трёхзначное число. Создайте программу, вычисляющую и
        //выводящую на экран сумму цифр n. Например: n =126, в результате мы должны получить
        //9 (1+2+6)
        System.out.println("введите !!!!!ТРЕХЗНАЧНОЕ ЧИСЛО!!!! = значение m: ");
        int m = Integer.parseInt(scan.nextLine());
        int r = 0;
        int t = 0;
        int y = 0;
        System.out.println("Вывести сумму цифр данного числа: ");
        int sum2 = 0;
        r += m % 10;
        t = m /= 10;
        y += t % 10;
        t = t /= 10;
        sum2 = t + y + r;
        System.out.println("Сумма цифр числа равна " + sum2);

        //В переменной x хранится вещественное число с ненулевой дробной частью. Создайте
        //программу, округляющую число x до ближайшего целого и выводящую результат на
        //экран
        System.out.println("задача - округлить дробное число до целого: ");
        Scanner scanner = new Scanner(System.in);
        double h = 2.6548;
        int hh = (int)h;
        System.out.println("округленное значение x переменной : " + hh);


    }
}
