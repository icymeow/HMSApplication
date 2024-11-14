package Info;

import java.util.ArrayList;
import java.util.List;

public class MedicalRecord {
    private String patientID;
    private List<String> pastDiagnoses;
    private List<String> treatments;
    private String additionalNotes;

    // Constructor
    public MedicalRecord(String patientID) {
        this.patientID = patientID;
        this.pastDiagnoses = new ArrayList<>();
        this.treatments = new ArrayList<>();
        this.additionalNotes = "";
    }

    // Getters and Setters
    public String getPatientID() {
        return patientID;
    }

    public List<String> getPastDiagnoses() {
        return pastDiagnoses;
    }

    public List<String> getTreatments() {
        return treatments;
    }

    public String getAdditionalNotes() {
        return additionalNotes;
    }

    public void setAdditionalNotes(String additionalNotes) {
        this.additionalNotes = additionalNotes;
    }

    // Methods to add diagnoses and treatments
    public void addDiagnosis(String diagnosis) {
        pastDiagnoses.add(diagnosis);
    }

    public void addTreatment(String treatment) {
        treatments.add(treatment);
    }

    @Override
    public String toString() {
        return "MedicalRecord{" +
                "patientID='" + patientID + '\'' +
                ", pastDiagnoses=" + pastDiagnoses +
                ", treatments=" + treatments +
                ", additionalNotes='" + additionalNotes + '\'' +
                '}';
    }
}
