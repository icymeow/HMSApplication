package UserMenu;

public class DoctorMenu {

    public static void displayMenu() {
        System.out.println("\nInfo.Doctor Menu:");
        System.out.println("1. View Info.Patient Medical Records");
        System.out.println("2. Update Info.Patient Medical Records");
        System.out.println("3. View Personal Schedule");
        System.out.println("4. Set Availability for Appointments");
        System.out.println("5. Accept or Decline Info.Appointment Requests");
        System.out.println("6. View Upcoming Appointments");
        System.out.println("7. Record Info.Appointment Outcome");
        System.out.println("8. Logout");
        System.out.print("Enter your choice: ");
    }

    public static void handleChoice(int choice) {
        switch (choice) {
            case 1:
                viewPatientMedicalRecords();
                break;
            case 2:
                updatePatientMedicalRecords();
                break;
            case 3:
                viewPersonalSchedule();
                break;
            case 4:
                setAvailability();
                break;
            case 5:
                handleAppointmentRequest();
                break;
            case 6:
                viewUpcomingAppointments();
                break;
            case 7:
                recordAppointmentOutcome();
                break;
            case 8:
                System.out.println("Logging out...");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    private static void viewPatientMedicalRecords() {
        System.out.println("Viewing patient medical records...");
        // Implement viewing patient medical records logic
    }

    private static void updatePatientMedicalRecords() {
        System.out.println("Updating patient medical records...");
        // Implement updating patient medical records logic
    }

    private static void viewPersonalSchedule() {
        System.out.println("Viewing personal schedule...");
        // Implement viewing personal schedule logic
    }

    private static void setAvailability() {
        System.out.println("Setting availability...");
        // Implement setting availability logic
    }

    private static void acceptOrDeclineAppointments() {
        System.out.println("Accepting or declining appointment requests...");
        // Implement accepting or declining appointment requests logic
    }

    private static void viewUpcomingAppointments() {
        System.out.println("Viewing upcoming appointments...");
        // Implement viewing upcoming appointments logic
    }

    private static void recordAppointmentOutcome() {
        System.out.println("Recording appointment outcome...");
        // Implement recording appointment outcome logic
    }
}


