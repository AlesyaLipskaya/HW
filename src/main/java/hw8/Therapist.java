package hw8;
public class Therapist extends Doctor {
    @Override
    public void assignDoctor(Patient patient) {
        patient.setDoctor(this);
        System.out.println("Therapist assigned to patient with treatment plan " + patient.getTreatmentPlan());
    }
}
