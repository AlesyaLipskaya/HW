package hw8;
public class Therapist extends Doctor {
    @Override
    public void treat() {
        System.out.println("Терапевт измерил температуру поломанным градусником");
    }
}
