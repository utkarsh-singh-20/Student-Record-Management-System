import java.util.Scanner;

public class Main {
    private static StudentManagementSystem sms = new StudentManagementSystem();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            showMenu();
            choice = getIntInput("Enter your choice: ");
            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    updateStudent();
                    break;
                case 3:
                    deleteStudent();
                    break;
                case 4:
                    viewStudent();
                    break;
                case 5:
                    viewAllStudents();
                    break;
                case 6:
                    System.out.println("Exiting the system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 6);
    }

    private static void showMenu() {
        System.out.println("\nStudent Record Management System");
        System.out.println("1. Add Student");
        System.out.println("2. Update Student");
        System.out.println("3. Delete Student");
        System.out.println("4. View Student");
        System.out.println("5. View All Students");
        System.out.println("6. Exit");
    }

    private static void addStudent() {
        int id = getIntInput("Enter student ID: ");
        String name = getStringInput("Enter student name: ");
        int age = getIntInput("Enter student age: ");
        String course = getStringInput("Enter student course: ");
        Student student = new Student(id, name, age, course);
        sms.addStudent(student);
    }

    private static void updateStudent() {
        int id = getIntInput("Enter student ID to update: ");
        String name = getStringInput("Enter new name: ");
        int age = getIntInput("Enter new age: ");
        String course = getStringInput("Enter new course: ");
        sms.updateStudent(id, name, age, course);
    }

    private static void deleteStudent() {
        int id = getIntInput("Enter student ID to delete: ");
        sms.deleteStudent(id);
    }

    private static void viewStudent() {
        int id = getIntInput("Enter student ID to view: ");
        sms.viewStudent(id);
    }

    private static void viewAllStudents() {
        sms.viewAllStudents();
    }

    private static int getIntInput(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. " + prompt);
            scanner.next();
        }
        int value = scanner.nextInt();
        scanner.nextLine(); // consume newline
        return value;
    }

    private static String getStringInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }
}
