package hw8;
public class Dentist extends Doctor {
    @Override
    public void assignDoctor(Patient patient) {
        patient.setDoctor(this);
        System.out.println("Dentist assigned to patient with treatment plan " + patient.getTreatmentPlan());
    }
}
