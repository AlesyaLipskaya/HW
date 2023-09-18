package hw8;
public class Patient {
    private int treatmentPlan;
    private Doctor doctor;
    public Patient(int treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }
    public void assignDoctor() {
        if (treatmentPlan == 1) {
            doctor = new Surgeon();
        } else if (treatmentPlan == 2) {
            doctor = new Dentist();
        } else {
            doctor = new Therapist();
        }
    }
    public void treat() {
        doctor.treat();
    }
}
