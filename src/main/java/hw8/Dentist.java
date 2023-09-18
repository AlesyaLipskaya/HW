package hw8;
public class Dentist extends Doctor {
    @Override
    public void treat() {
        System.out.println("Стоматолог вырвал не тот зуб");
    }
}
