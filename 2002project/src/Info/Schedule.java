package Info;

public class Schedule {
    private String patientID;
    private String doctorID;
    private String status;  // e.g., "confirmed", "canceled", "completed"
    private String date;
    private String time;

    public Schedule(String patientID, String doctorID, String date, String time) {
        this.patientID = patientID;
        this.doctorID = doctorID;
        this.date = date;
        this.time = time;
        this.status = "pending";
    }

    public void confirm() {
        this.status = "confirmed";
    }

    public void cancel() {
        this.status = "canceled";
    }

    public void updateStatus(String newStatus) {
        this.status = newStatus;
    }

    public void viewSchedule() {
        System.out.println("Schedule for Patient ID: " + patientID + ", Doctor ID: " + doctorID);
        System.out.println("Date: " + date + ", Time: " + time + ", Status: " + status);
    }

    public String getStatus() {
        return status;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "patientID='" + patientID + '\'' +
                ", doctorID='" + doctorID + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
