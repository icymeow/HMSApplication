package UserMenu;

public class PatientMenu {
    public static void displayMenu() {
        System.out.println("\n--- Info.Patient Menu ---");
        System.out.println("1. View Medical Record");
        System.out.println("2. Update Personal Information");
        System.out.println("3. View Available Info.Appointment Slots");
        System.out.println("4. Schedule an Info.Appointment");
        System.out.println("5. Reschedule an Info.Appointment");
        System.out.println("6. Cancel an Info.Appointment");
        System.out.println("7. View Scheduled Appointments");
        System.out.println("8. View Past Info.Appointment Outcome Records");
        System.out.println("9. Logout");
        System.out.print("Please enter your choice: ");
    }

    public static void handleChoice(int choice) {
        switch (choice) {
            case 1:
                viewMedicalRecord();
                break;
            case 2:
                updatePersonalInfo();
                break;
            case 3:
                viewAvailableAppointments();
                break;
            case 4:
                scheduleAppointment();
                break;
            case 5:
                rescheduleAppointment();
                break;
            case 6:
                cancelAppointment();
                break;
            case 7:
                viewScheduledAppointments();
                break;
            case 8:
                viewPastAppointmentRecords();
                break;
            case 9:
                System.out.println("Logging out...");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    private static void viewMedicalRecord() {
        System.out.println("Viewing medical record...");
        // Implement viewing medical record logic
    }

    private static void updatePersonalInfo() {
        System.out.println("Updating personal information...");
        // Implement updating personal information logic
    }

    private static void viewAvailableAppointments() {
        System.out.println("Viewing available appointment slots...");
        // Implement viewing available appointment slots logic
    }

    private static void scheduleAppointment() {
        System.out.println("Scheduling an appointment...");
        // Implement scheduling an appointment logic
    }

    private static void rescheduleAppointment() {
        System.out.println("Rescheduling an appointment...");
        // Implement rescheduling an appointment logic
    }

    private static void cancelAppointment() {
        System.out.println("Cancelling an appointment...");
        // Implement cancelling an appointment logic
    }

    private static void viewScheduledAppointments() {
        System.out.println("Viewing scheduled appointments...");
        // Implement viewing scheduled appointments logic
    }

    private static void viewPastAppointmentRecords() {
        System.out.println("Viewing past appointment outcome records...");
        // Implement viewing past appointment outcome records logic
    }
}

