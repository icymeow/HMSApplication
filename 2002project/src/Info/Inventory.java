package Info;

public abstract class Inventory {
    private String medicineName;
    private int stockLevel;
    private boolean lowStockAlert;

    public Inventory(String medicineName, int stockLevel) {
        this.medicineName = medicineName;
        this.stockLevel = stockLevel;
        this.lowStockAlert = stockLevel < 10; // Example threshold
    }

    public void updateStockLevel(int amount) {
        this.stockLevel += amount;
        checkLowStock();
    }

    private void checkLowStock() {
        this.lowStockAlert = this.stockLevel < 10;
    }

    public void submitReplenishmentRequest(String medicineName) {
        System.out.println("Replenishment request submitted for " + medicineName);
    }
}

