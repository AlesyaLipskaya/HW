package hw8;
public class Surgeon extends Doctor {
    @Override
    public void treat() {
        System.out.println("Хирург случайно вырезал почку");
    }
}
