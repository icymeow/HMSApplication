import UserMenu.AdministratorMenu;
import UserMenu.DoctorMenu;
import UserMenu.PatientMenu;
import UserMenu.PharmacistMenu;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HMSApplication {
    private static Map<String, String> userCredentials = new HashMap<>();
    private static Map<String, String> userRoles = new HashMap<>();

    public static void main(String[] args) {
        initializeUsers();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Hospital Management System!");
        String hospitalID;
        String password;
        boolean isAuthenticated = false;

        // Info.User authentication loop
        while (!isAuthenticated) {
            System.out.print("Enter your Hospital ID: ");
            hospitalID = scanner.nextLine();
            System.out.print("Enter your password: ");
            password = scanner.nextLine();

            isAuthenticated = authenticateUser(hospitalID, password);

            if (!isAuthenticated) {
                System.out.println("Invalid credentials. Please try again.");
            } else {
                System.out.println("Login successful!");
                String userRole = userRoles.get(hospitalID);
                displayUserMenu(userRole);
            }
        }
        scanner.close();
    }

    // Initialize users with their credentials and roles
    // should read date from excel????
    private static void initializeUsers() {
        // Sample data
        userCredentials.put("P1001", "password");
        userRoles.put("P1001", "Info.Patient");

        userCredentials.put("D2001", "password");
        userRoles.put("D2001", "Info.Doctor");

        userCredentials.put("PH3001", "password");
        userRoles.put("PH3001", "Info.Pharmacist");

        userCredentials.put("A4001", "password");
        userRoles.put("A4001", "Info.Administrator");

        // Additional users can be added here
    }

    // Authenticate the user based on Hospital ID and password
    private static boolean authenticateUser(String hospitalID, String password) {
        return userCredentials.containsKey(hospitalID) && userCredentials.get(hospitalID).equals(password);
    }

    // Display the menu based on the user's role
    private static void displayUserMenu(String userRole) {
        boolean running = true;
        Scanner scanner = new Scanner(System.in);

        while (running) {
            switch (userRole) {
                case "Info.Patient":
                    PatientMenu.displayMenu();
                    int patientChoice = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    PatientMenu.handleChoice(patientChoice);
                    if (patientChoice == 9) running = false; // Logout option
                    break;
                case "Info.Doctor":
                    DoctorMenu.displayMenu();
                    int doctorChoice = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    DoctorMenu.handleChoice(doctorChoice);
                    if (doctorChoice == 8) running = false; // Logout option
                    break;
                case "Info.Pharmacist":
                    PharmacistMenu.displayMenu();
                    int pharmacistChoice = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    PharmacistMenu.handleChoice(pharmacistChoice);
                    if (pharmacistChoice == 5) running = false; // Logout option
                    break;
                case "Info.Administrator":
                    AdministratorMenu.displayMenu();
                    int adminChoice = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    AdministratorMenu.handleChoice(adminChoice);
                    if (adminChoice == 5) running = false; // Logout option
                    break;
                default:
                    System.out.println("Invalid role.");
                    running = false;
                    break;
            }
        }
        scanner.close();
    }
}
