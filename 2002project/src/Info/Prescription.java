package Info;

public class Prescription {
    private String status;  // e.g., "pending", "dispensed"
    private String medicineName;

    public Prescription(String medicineName) {
        this.medicineName = medicineName;
        this.status = "pending";
    }

    public void dispense() {
        this.status = "dispensed";
    }

    public void updateStatus(String newStatus) {
        this.status = newStatus;
    }

    public String getStatus() {
        return status;
    }

    public String getMedicineName() {
        return medicineName;
    }

    @Override
    public String toString() {
        return "Prescription{" +
                "medicineName='" + medicineName + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}

