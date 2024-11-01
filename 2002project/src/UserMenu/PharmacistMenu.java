package UserMenu;

public class PharmacistMenu {

    public static void displayMenu() {
        System.out.println("\nInfo.Pharmacist Menu:");
        System.out.println("1. View Info.Appointment Outcome Record");
        System.out.println("2. Update Prescription Status");
        System.out.println("3. View Medication Inventory");
        System.out.println("4. Submit Replenishment Request");
        System.out.println("5. Logout");
        System.out.print("Enter your choice: ");
    }

    public static void handleChoice(int choice) {
        switch (choice) {
            case 1:
                viewAppointmentOutcomeRecord();
                break;
            case 2:
                updatePrescriptionStatus();
                break;
            case 3:
                viewMedicationInventory();
                break;
            case 4:
                submitReplenishmentRequest();
                break;
            case 5:
                System.out.println("Logging out...");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    private static void viewAppointmentOutcomeRecord() {
        System.out.println("Viewing appointment outcome record...");
        // Implement viewing appointment outcome record logic
    }

    private static void updatePrescriptionStatus() {
        System.out.println("Updating prescription status...");
        // Implement updating prescription status logic
    }

    private static void viewMedicationInventory() {
        System.out.println("Viewing medication inventory...");
        // Implement viewing medication inventory logic
    }

    private static void submitReplenishmentRequest() {
        System.out.println("Submitting replenishment request...");
        // Implement submitting replenishment request logic
    }
}
