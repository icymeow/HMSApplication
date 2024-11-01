package Info;

public class Pharmacist extends User {
    // Additional attributes for Info.Pharmacist
    private String pharmacistID;

    // Constructor
    public Pharmacist(String userID, String password, String pharmacistID) {
        super(userID, password, "Info.Pharmacist");
        this.pharmacistID = pharmacistID;
    }

    // Getter
    public String getPharmacistID() {
        return pharmacistID;
    }

    // Display pharmacist information
    public void displayPharmacistInfo() {
        displayUserInfo(); // Calls the method from Info.User class
        System.out.println("Info.Pharmacist ID: " + pharmacistID);
    }

    // Method to update prescription status
    public void updatePrescriptionStatus(String prescriptionID, String status) {
        System.out.println("Prescription " + prescriptionID + " updated to " + status);
    }
}
