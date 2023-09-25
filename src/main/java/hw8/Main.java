package hw8;
public class Main {
    public static void main(String[] args) {
        Patient patient1 = new Patient(1);
        Therapist therapist = new Therapist();
        Surgeon surgeon = new Surgeon();
        Dentist dentist = new Dentist();

        therapist.assignDoctor(patient1);

        Patient patient2 = new Patient(2);
        surgeon.assignDoctor(patient2);

        Patient patient3 = new Patient(3);
        dentist.assignDoctor(patient3);
    }
}
