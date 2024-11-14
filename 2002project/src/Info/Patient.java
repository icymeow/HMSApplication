package Info;

public class Patient extends User implements PersonalInfo {
    private String name;
    private String dateOfBirth;
    private String gender;
    private String bloodType;
    private String contactInfo;
    private MedicalRecord medicalRecord;

    // Constructor
    public Patient(String userID, String password, String role, String name, String dateOfBirth, String gender, String bloodType, String contactInfo) {
        super(userID, password, role);
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.bloodType = bloodType;
        this.contactInfo = contactInfo;
        this.medicalRecord = new MedicalRecord(userID); // Initialize medical record with patient ID
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public MedicalRecord getMedicalRecord() {
        return medicalRecord;
    }

    public void setMedicalRecord(MedicalRecord medicalRecord) {
        this.medicalRecord = medicalRecord;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "userID='" + getUserID() + '\'' +
                ", role='" + getRole() + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", bloodType='" + bloodType + '\'' +
                ", contactInfo='" + contactInfo + '\'' +
                ", medicalRecord=" + medicalRecord +
                '}';
    }
}
