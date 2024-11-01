package Info;

public class Administrator extends User {
    // Additional attributes for Info.Administrator
    private String adminID;

    // Constructor
    public Administrator(String userID, String password, String adminID) {
        super(userID, password, "Info.Administrator");
        this.adminID = adminID;
    }

    // Getter
    public String getAdminID() {
        return adminID;
    }

    // Display administrator information
    public void displayAdminInfo() {
        displayUserInfo(); // Calls the method from Info.User class
        System.out.println("Admin ID: " + adminID);
    }

    // Method to manage hospital staff
    public void manageStaff(String staffID, String action) {
        System.out.println("Staff ID: " + staffID + " has been " + action);
    }

    // Method to manage inventory
    public void manageInventory(String medicineName, int quantity, String action) {
        System.out.println("Info.Medicine: " + medicineName + " has been " + action + " with quantity " + quantity);
    }
}

