package Info;

import Utils.CSVUtils;
import java.util.List;

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

    // Business logic for managing hospital staff
    public List<String[]> viewStaff(String staffFile) {
        return CSVUtils.readCSV(staffFile);
    }

    public void addStaff(String staffFile, String[] newStaff) {
        List<String[]> staffRecords = CSVUtils.readCSV(staffFile);
        staffRecords.add(newStaff);
        CSVUtils.writeCSV(staffFile, staffRecords);
    }

    public boolean updateStaff(String staffFile, String staffID, String[] updatedStaff) {
        List<String[]> staffRecords = CSVUtils.readCSV(staffFile);
        for (String[] record : staffRecords) {
            if (record[0].equals(staffID)) {
                System.arraycopy(updatedStaff, 0, record, 0, updatedStaff.length);
                CSVUtils.writeCSV(staffFile, staffRecords);
                return true;
            }
        }
        return false;
    }

    public boolean removeStaff(String staffFile, String staffID) {
        List<String[]> staffRecords = CSVUtils.readCSV(staffFile);
        boolean removed = staffRecords.removeIf(record -> record[0].equals(staffID));
        if (removed) {
            CSVUtils.writeCSV(staffFile, staffRecords);
        }
        return removed;
    }

    // Business logic for inventory management
    public List<String[]> viewInventory(String inventoryFile) {
        return CSVUtils.readCSV(inventoryFile);
    }

    public void addInventory(String inventoryFile, String[] newInventory) {
        List<String[]> inventoryRecords = CSVUtils.readCSV(inventoryFile);
        inventoryRecords.add(newInventory);
        CSVUtils.writeCSV(inventoryFile, inventoryRecords);
    }

    public boolean updateInventory(String inventoryFile, String itemName, String[] updatedInventory) {
        List<String[]> inventoryRecords = CSVUtils.readCSV(inventoryFile);
        for (String[] record : inventoryRecords) {
            if (record[0].equals(itemName)) {
                System.arraycopy(updatedInventory, 0, record, 0, updatedInventory.length);
                CSVUtils.writeCSV(inventoryFile, inventoryRecords);
                return true;
            }
        }
        return false;
    }

    public boolean removeInventory(String inventoryFile, String itemName) {
        List<String[]> inventoryRecords = CSVUtils.readCSV(inventoryFile);
        boolean removed = inventoryRecords.removeIf(record -> record[0].equals(itemName));
        if (removed) {
            CSVUtils.writeCSV(inventoryFile, inventoryRecords);
        }
        return removed;
    }

    // Method to manage hospital staff
    /*public void manageStaff(String staffID, String action) {
        System.out.println("Staff ID: " + staffID + " has been " + action);
    }

    // Method to manage inventory
    public void manageInventory(String medicineName, int quantity, String action) {
        System.out.println("Info.Medicine: " + medicineName + " has been " + action + " with quantity " + quantity);
    }*/
}

