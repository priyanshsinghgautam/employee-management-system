import java.util.Scanner;

import model.Employee;
import service.EmployeeService;
import service.EmployeeServiceImpl;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // Dependency Injection (manual)
        EmployeeService service = new EmployeeServiceImpl();

        while (true) {
            System.out.println("\n--- Employee Management System ---");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Search Employee by ID");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice;
            try {
                choice = sc.nextInt();
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("Invalid input!");
                sc.nextLine();
                continue;
            }

            switch (choice) {
                case 1:
                    addEmployee(service);
                    break;

                case 2:
                    service.viewEmployees();
                    break;

                case 3:
                    searchEmployee(service);
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    // ---------------- HELPER METHODS ----------------

    static void addEmployee(EmployeeService service) {
        try {
            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Department: ");
            String dept = sc.nextLine();

            System.out.print("Enter Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();

            Employee emp = new Employee(id, name, dept, salary);

            service.addEmployee(emp);

        } catch (Exception e) {
            System.out.println("Error while adding employee!");
            sc.nextLine();
        }
    }

    static void searchEmployee(EmployeeService service) {
        try {
            System.out.print("Enter Employee ID to search: ");
            int id = sc.nextInt();
            sc.nextLine();

            service.searchEmployee(id);

        } catch (Exception e) {
            System.out.println("Invalid input!");
            sc.nextLine();
        }
    }
}
