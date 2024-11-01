package Info;

public class Appointment {
    private String appointmentID;
    private String patientID;
    private String doctorID;
    private String status;  // e.g., "pending", "confirmed", "canceled", "completed"
    private String date;
    private String time;
    private String outcome; // e.g., details of the service provided, consultation notes

    public Appointment(String appointmentID, String patientID, String doctorID, String date, String time) {
        this.appointmentID = appointmentID;
        this.patientID = patientID;
        this.doctorID = doctorID;
        this.date = date;
        this.time = time;
        this.status = "pending";
        this.outcome = "";
    }

    // Patient methods
    public void confirm() {
        this.status = "confirmed";
    }

    public void cancel() {
        this.status = "canceled";
    }

    public void reschedule(String newDate, String newTime) {
        this.date = newDate;
        this.time = newTime;
        this.status = "rescheduled";
    }

    public String viewStatus() {
        return "Appointment Status: " + status;
    }

    // Display appointment details
    public void displayAppointmentDetails() {
        System.out.println("Info.Appointment ID: " + appointmentID);
        System.out.println("Info.Patient ID: " + patientID);
        System.out.println("Info.Doctor ID: " + doctorID);
        System.out.println("Info.Appointment Date: " + date);
        System.out.println("Status: " + status);
    }



    // Doctor methods
    public void recordOutcome(String serviceType, String notes) {
        this.outcome = "Service: " + serviceType + ", Notes: " + notes;
        this.status = "completed";
    }

    public String getOutcome() {
        return outcome;
    }

    // Administrator method to update status directly
    public void updateStatus(String newStatus) {
        this.status = newStatus;
    }

    // Accessor methods
    public String getPatientID() {
        return patientID;
    }

    public String getDoctorID() {
        return doctorID;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "patientID='" + patientID + '\'' +
                ", doctorID='" + doctorID + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", status='" + status + '\'' +
                ", outcome='" + outcome + '\'' +
                '}';
    }
}

/*import java.time.LocalDateTime;

public class Appointment {
    private String appointmentID;
    private String patientID;
    private String doctorID;
    private LocalDateTime appointmentDate;
    private String status;  // e.g., "pending", "confirmed", "canceled", "completed"
    private String appointmentTime;
    private String outcome;

    // Constructor
    public Appointment(String appointmentID, String patientID, String doctorID, LocalDateTime appointmentDate,  String appointmentTime,String status) {
        this.appointmentID = appointmentID;
        this.patientID = patientID;
        this.doctorID = doctorID;
        this.appointmentDate = appointmentDate;
        this.appointmentTime = appointmentTime;
        this.status = status;
        this.outcome = "";
    }

    // Getter and Setter methods
    public String getAppointmentID() {
        return appointmentID;
    }

    public String getPatientID() {
        return patientID;
    }

    public String getDoctorID() {
        return doctorID;
    }

    public LocalDateTime getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(LocalDateTime appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public LocalDateTime getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(LocalDateTime appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }



    // Method to cancel the appointment
    public void cancelAppointment() {
        this.status = "Canceled";
    }

    // Method to confirm the appointment
    public void confirmAppointment() {
        this.status = "Confirmed";
    }

    //Method to reschedule the appointment
    public void reschedule(String newDate, String newTime) {
        this.appointmentDate = newDate;
        this.appointmentTime = newTime;
        this.status = "rescheduled";
    }

    // Display appointment details
    public void displayAppointmentDetails() {
        System.out.println("Info.Appointment ID: " + appointmentID);
        System.out.println("Info.Patient ID: " + patientID);
        System.out.println("Info.Doctor ID: " + doctorID);
        System.out.println("Info.Appointment Date: " + appointmentDate);
        System.out.println("Status: " + status);
    }
}
*/

