package Info;

public class Medicine {
    private String medicineName;
    private String dosage; // e.g., "500mg", "10ml"
    private int stockLevel;
    private int lowStockAlertLevel;

    // Constructor
    public Medicine(String medicineName, String dosage, int stockLevel, int lowStockAlertLevel) {
        this.medicineName = medicineName;
        this.dosage = dosage;
        this.stockLevel = stockLevel;
        this.lowStockAlertLevel = lowStockAlertLevel;
    }

    // Getter and Setter methods
    public String getMedicineName() {
        return medicineName;
    }

    public String getDosage() {
        return dosage;
    }

    public int getStockLevel() {
        return stockLevel;
    }

    public void setStockLevel(int stockLevel) {
        this.stockLevel = stockLevel;
    }

    public int getLowStockAlertLevel() {
        return lowStockAlertLevel;
    }

    public void setLowStockAlertLevel(int lowStockAlertLevel) {
        this.lowStockAlertLevel = lowStockAlertLevel;
    }

    // Method to reduce the stock level after dispensing
    public void dispenseMedicine(int quantity) {
        if (stockLevel >= quantity) {
            stockLevel -= quantity;
            System.out.println("Dispensed " + quantity + " units of " + medicineName);
        } else {
            System.out.println("Insufficient stock for " + medicineName);
        }
    }

    // Method to check if stock is below alert level
    public boolean isStockLow() {
        return stockLevel <= lowStockAlertLevel;
    }

    // Display medicine details
    public void displayMedicineInfo() {
        System.out.println("Info.Medicine Name: " + medicineName);
        System.out.println("Dosage: " + dosage);
        System.out.println("Stock Level: " + stockLevel);
        System.out.println("Low Stock Alert Level: " + lowStockAlertLevel);
    }
}
