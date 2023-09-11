package hw6;

public class Main {
    public static void main(String[] args) {
        CreditCard card1 = new CreditCard("123456789", 1703);
        CreditCard card2 = new CreditCard("987654321", 404);
        CreditCard card3 = new CreditCard("555555555", 1201);

        card1.deposit(777);
        card2.deposit(666);

        card3.withdraw(13);

        card1.printInfo();
        card2.printInfo();
        card3.printInfo();
    }
}
