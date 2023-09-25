package hw8;
public class Surgeon extends Doctor {
    @Override
    public void assignDoctor(Patient patient) {
        patient.setDoctor(this);
        System.out.println("Surgeon assigned to patient with treatment plan " + patient.getTreatmentPlan());
    }
}
