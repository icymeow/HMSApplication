package Info;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/*Medical Record Management: 
○ Doctors can view the medical records of patients under their care.  
○ Doctors can update the medical records of patients by adding new diagnoses, 
prescriptions, and treatment plans. 
Appointment Management: 
○ Doctors can view their personal schedule and set their availability for 
appointments. 
○ Doctors can accept or decline appointment requests. 
○ Doctors can view the list of their upcoming appointments. 
○ Appointment Outcome Record: After each completed appointment, the doctor 
will record the: 
● Date of Appointment 
● Type of service provided (e.g., consultation, X-ray, blood test etc). 
● Any prescribed medications: - 
medication name - 
status (default is pending) 
● Consultation notes 
*/

public class Doctor extends User {
    private List<Appointment> appointments; // List of appointments for the doctor
    private Map<String, Boolean> availableSlots; // Map of available slots (date-time as key, availability as value)

    // Constructor
    public Doctor(String doctorID, String password, String role) {
        super(doctorID, password, role);
        this.appointments = new ArrayList<>();
        this.availableSlots = new HashMap<>();
    }

    // View personal schedule
    public void viewSchedule() {
        System.out.println("Doctor's Schedule:");
        for (Appointment appointment : appointments) {
            System.out.println(appointment);
        }
    }

    // Set availability for appointments
    public void setAvailability(String date, String time) {
        // Combine date and time into a standardized format
        String dateTime = date + " " + time;
        availableSlots.put(dateTime, true); // Mark slot as available
        System.out.println("Slot added as available: " + dateTime);
    }

    // Check if a slot is available
    public boolean isSlotAvailable(String date, String Time) {
        return availableSlots.getOrDefault(date+Time, false);
    }

    // Book a slot (mark it as unavailable)
    public boolean bookSlot(String date, String Time) {
        if (isSlotAvailable(date,Time)) {
            availableSlots.put(date+Time, false); // Mark the slot as booked
            System.out.println("Slot booked: " + date+ Time);
            return true;
        }
        System.out.println("Slot not available: " + date+Time);
        return false;
    }

    // Release a slot (mark it as available)
    public void releaseSlot(String date, String Time) {
        if (availableSlots.containsKey(date+Time)) {
            availableSlots.put(date+Time, true); // Mark the slot as available again
            System.out.println("Slot released: " + date+Time);
        } else {
            System.out.println("Slot not found: " + date+Time);
        }
    }

    public void displayAvailableSlots() {
        System.out.println("Available Slots:");
        boolean hasAvailableSlots = false;

        for (Map.Entry<String, Boolean> entry : availableSlots.entrySet()) {
            if (entry.getValue()) { // Check if the slot is available (true)
                System.out.println("- " + entry.getKey()); // Display the slot
                hasAvailableSlots = true;
            }
        }

        if (!hasAvailableSlots) {
            System.out.println("No available slots at the moment.");
        }
    }


    // Accept or decline appointment
    public void handleAppointmentRequest(String appointmentId, boolean accept) {
        for (Appointment appointment : appointments) {
            if (appointment.getAppointmentId().equals(appointmentId)) {
                if (accept) {
                    appointment.setStatus("Accepted");
                    System.out.println("Appointment " + appointmentId + " accepted.");
                } else {
                    appointment.setStatus("Declined");
                    System.out.println("Appointment " + appointmentId + " declined.");
                }
                return;
            }
        }
        System.out.println("Appointment not found.");
    }

    // View list of upcoming appointments
    public void viewUpcomingAppointments() {
        System.out.println("Upcoming Appointments:");
        for (Appointment appointment : appointments) {
            if ("Accepted".equals(appointment.getStatus())) {
                System.out.println(appointment);
            }
        }
    }

   // Method to record appointment outcome
    public void recordAppointmentOutcome(String appointmentId, String serviceType, List<String> medications, String notes) {
        for (Appointment appointment : appointments) {
            if (appointment.getAppointmentId().equals(appointmentId)) {
                appointment.setStatus("Completed");
                appointment.setServiceType(serviceType);
                appointment.setMedications(medications);
                appointment.setNotes(notes);
                appointment.setDateOfCompletion(java.time.LocalDate.now()); // Record the date of appointment
                System.out.println("Appointment " + appointmentId + " marked as completed.");
                return;
            }
        }
        System.out.println("Appointment not found.");
    }


    // Add new appointment
    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
    }
    
    // Method to update patient medical records
    public void updatePatientMedicalRecords(String patientId, String newDiagnosis, List<String> newPrescriptions, String treatmentPlan) {
        for (Patient patient : patientsUnderCare) {
            if (patient.getPatientId().equals(patientId)) {
                patient.addDiagnosis(newDiagnosis);
                patient.addPrescriptions(newPrescriptions);
                patient.updateTreatmentPlan(treatmentPlan);
                System.out.println("Medical record updated for patient " + patientId);
                return;
            }
        }
        System.out.println("Patient not under your care.");
    }

    
}
