import models.User;
import services.UserService;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        UserService userService = new UserService();
        User currentUser = null;

        System.out.println("\n\n---------------------------- Welcome to the Movie Booking ----------------------------");

        while (currentUser == null) {
            System.out.println("\nChoose an option:");
            System.out.println("SignUp : 1");
            System.out.println("SignIn : 2");
            System.out.println("Exit : 3");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    try {
                        System.out.println("\n--- Sign Up ---");
                        System.out.print("Enter name: ");
                        String userName = scanner.nextLine();
                        System.out.print("Enter email: ");
                        String email = scanner.nextLine();
                        System.out.print("Enter Mobile Number: ");
                        String mobileNumber = scanner.nextLine();
                        System.out.print("Enter password: ");
                        String password = scanner.nextLine();

                        currentUser = userService.addUser(userName, email, mobileNumber, password);
                        System.out.println("User registered successfully!");

                    } catch (Exception e) {
                        System.out.println("Registration failed: " + e.getMessage());
                        System.out.println("Please try again.");
                    }
                    break;

                case 2:
                    try {
                        System.out.println("\n--- Sign In ---");
                        System.out.print("Enter email: ");
                        String email = scanner.nextLine();
                        System.out.print("Enter password: ");
                        String password = scanner.nextLine();

                        currentUser = userService.authenticateUser(email, password);
                        System.out.println("Login successful! Welcome " + currentUser.getUserName());

                    } catch (Exception exception) {
                        System.out.println("Login failed: " + exception.getMessage());
                        System.out.println("Please try again or sign up if you don't have an account.");
                    }
                    break;

                case 3: // Exit
                    System.out.println("Thank you for using movie  booking. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                    break;
            }
        }


        System.out.println("\nWelcome to ROVERZ! Current user: " +
                currentUser.getUserName() + " (" + currentUser.getRole() + ")");

        scanner.close();
    }
}
