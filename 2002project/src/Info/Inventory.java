package Info;


import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Inventory{
    private String medicineName;
    private int stockLevel;
    private int lowStockAlertLevel;
    private static final String medicineFilePath = "Medicine_List.xlsx";  // Path to the Excel file

    // Constructor
    public void Medicine(String medicineName, String dosage, int stockLevel, int lowStockAlertLevel) {
        this.medicineName = medicineName;
        this.stockLevel = stockLevel;
        this.lowStockAlertLevel = lowStockAlertLevel;
    }

    // Getter and Setter methods
    public String getMedicineName() {
        return medicineName;
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
        System.out.println("Medicine Name: " + medicineName);
        System.out.println("Stock Level: " + stockLevel);
        System.out.println("Low Stock Alert Level: " + lowStockAlertLevel);
    }

    // Static method to read all medicine details from the Excel file
    public static void readMedicineList() throws IOException {
        try (FileInputStream fis = new FileInputStream(medicineFilePath);
             Workbook workbook = new XSSFWorkbook(fis)) {
            Sheet sheet = workbook.getSheetAt(0);
            for (Row row : sheet) {
                String medicineName = row.getCell(0).getStringCellValue();
                String dosage = row.getCell(1).getStringCellValue();
                int stockLevel = (int) row.getCell(2).getNumericCellValue();
                int lowStockAlertLevel = (int) row.getCell(3).getNumericCellValue();

                System.out.println("Medicine: " + medicineName + ", Dosage: " + dosage +
                        ", Stock Level: " + stockLevel + ", Low Stock Alert: " + lowStockAlertLevel);
            }
        }
    }

    // Static method to update the stock level of a specific medicine in the Excel file
    public static void updateMedicineStock(String medicineName, int newStockLevel) throws IOException {
        try (FileInputStream fis = new FileInputStream(medicineFilePath);
             Workbook workbook = new XSSFWorkbook(fis)) {
            Sheet sheet = workbook.getSheetAt(0);
            boolean found = false;

            for (Row row : sheet) {
                if (row.getCell(0).getStringCellValue().equalsIgnoreCase(medicineName)) {
                    row.getCell(2).setCellValue(newStockLevel);  // Update stock level
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Medicine not found in the inventory.");
            } else {
                try (FileOutputStream fos = new FileOutputStream(medicineFilePath)) {
                    workbook.write(fos);
                    System.out.println("Stock level for " + medicineName + " updated to " + newStockLevel);
                }
            }
        }
    }
}
