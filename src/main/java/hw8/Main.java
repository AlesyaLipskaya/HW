package hw8;
public class Main {
    public static void main(String[] args) {
        Patient patient = new Patient(1);
        patient.assignDoctor();
        patient.treat();
        patient = new Patient(2);
        patient.assignDoctor();
        patient.treat();
        patient = new Patient(3);
        patient.assignDoctor();
        patient.treat();
    }
}
