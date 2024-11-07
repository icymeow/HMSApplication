package Info;

public class Patient extends User implements PersonalInfo {
    public MedicalRecord medicalRecord;
    private String patientID;
    private String name;
    private String dateOfBirth;
    private String gender;
    private String contactInfo;
    private String bloodType;

    // Constructor
    public Patient(String userID, String password, String patientID, String name, String dateOfBirth, String gender, String contactInfo, String bloodType) {
        super(userID, password, "Info.Patient");
        this.patientID = patientID;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.contactInfo = contactInfo;
        this.bloodType = bloodType;
    }

    // Implementing methods from Info.PersonalInfo
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public String getContactInfo() {
        return contactInfo;
    }

    @Override
    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    // Additional methods for Info.Patient
    public String getPatientID() {
        return patientID;
    }

    public String getBloodType() {
        return bloodType;
    }

    // Display patient information
    public void displayPatientInfo() {
        displayUserInfo(); // Calls the method from Info.User class
        System.out.println("Info.Patient ID: " + patientID);
        System.out.println("Name: " + name);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Gender: " + gender);
        System.out.println("Contact Info: " + contactInfo);
        System.out.println("Blood Type: " + bloodType);
    }
}


