package Info;

public class MedicalRecord {
    private String patientID;
    private String[] pastDiagnoses;
    private String[] treatments;
    private String additionalNotes;

    // Constructor
    public MedicalRecord(String patientID, String[] pastDiagnoses, String[] treatments, String additionalNotes) {
        this.patientID = patientID;
        this.pastDiagnoses = pastDiagnoses;
        this.treatments = treatments;
        this.additionalNotes = additionalNotes;
    }

    // Getter and Setter methods
    public String getPatientID() {
        return patientID;
    }

    public String[] getPastDiagnoses() {
        return pastDiagnoses;
    }

    public void setPastDiagnoses(String[] pastDiagnoses) {
        this.pastDiagnoses = pastDiagnoses;
    }

    public String[] getTreatments() {
        return treatments;
    }

    public void setTreatments(String[] treatments) {
        this.treatments = treatments;
    }

    public String getAdditionalNotes() {
        return additionalNotes;
    }

    public void setAdditionalNotes(String additionalNotes) {
        this.additionalNotes = additionalNotes;
    }

    // Method to add a new diagnosis
    public void addDiagnosis(String diagnosis) {
        // Logic to add the diagnosis to the pastDiagnoses array
    }

    // Method to add a new treatment
    public void addTreatment(String treatment) {
        // Logic to add the treatment to the treatments array
    }

    // Display medical record information
    public void displayRecord() {
        System.out.println("Info.Patient ID: " + patientID);
        System.out.println("Diagnoses: " + String.join(", ", pastDiagnoses));
        System.out.println("Treatments: " + String.join(", ", treatments));
        System.out.println("Additional Notes: " + additionalNotes);
    }
}

