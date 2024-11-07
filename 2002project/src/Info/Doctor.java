package Info;

import java.util.ArrayList;
import java.util.List;

public class Doctor extends User {
    private String doctorID;
    private List<String> availability;
    private List<Patient> patientList;
    private String specialization;

    public Doctor(String userID, String password, String doctorID, String specialization) {
        super(userID, password, "Doctor");
        this.doctorID = doctorID;
        this.specialization = specialization;
        this.availability = new ArrayList<>();
        this.patientList = new ArrayList<>();
    }

    public void viewPatientRecord(Patient patient) {
        System.out.println(patient.medicalRecord);
    }

    public void updateMedicalRecords(Patient patient, String diagnosis, String treatment) {
        patient.medicalRecord.addDiagnosis(diagnosis);
        patient.medicalRecord.addTreatment(treatment);
    }

    public void setAvailability(String timeSlot) {
        availability.add(timeSlot);
    }

    public void acceptRequest(Appointment appointment) {
        appointment.updateStatus("Confirmed");
    }

    public void declineRequest(Appointment appointment) {
        appointment.updateStatus("Cancelled");
    }

    public void logout() {
        System.out.println("Doctor logged out");
    }

    public void displayDoctorInfo() {
        displayUserInfo(); // Calls the method from Info.User class
        System.out.println("Info.Doctor ID: " + doctorID);
        System.out.println("Specialization: " + specialization);
    }

    // Method to accept or decline appointment requests
    public void manageAppointmentRequest(String appointmentID, boolean accept) {
        if (accept) {
            System.out.println("Info.Appointment " + appointmentID + " accepted.");
        } else {
            System.out.println("Info.Appointment " + appointmentID + " declined.");
        }
    }
}




/*public class Doctor extends User {
    // Additional attributes for Info.Doctor
    private String doctorID;
    private String specialization;

    // Constructor
    public Doctor(String userID, String password, String doctorID, String specialization) {
        super(userID, password, "Info.Doctor");
        this.doctorID = doctorID;
        this.specialization = specialization;
    }

    // Getters and Setters
    public String getDoctorID() {
        return doctorID;
    }

    public String getSpecialization() {
        return specialization;
    }

    // Display doctor information
    public void displayDoctorInfo() {
        displayUserInfo(); // Calls the method from Info.User class
        System.out.println("Info.Doctor ID: " + doctorID);
        System.out.println("Specialization: " + specialization);
    }

    // Method to accept or decline appointment requests
    public void manageAppointmentRequest(String appointmentID, boolean accept) {
        if (accept) {
            System.out.println("Info.Appointment " + appointmentID + " accepted.");
        } else {
            System.out.println("Info.Appointment " + appointmentID + " declined.");
        }
    }
}
*/