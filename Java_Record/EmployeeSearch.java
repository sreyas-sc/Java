import java.util.Scanner;

class Employee {
    int enumber;
    String ename;
    double esalary;

    public Employee(int enumber, String ename, double esalary) {
        this.enumber = enumber;
        this.ename = ename;
        this.esalary = esalary;
    }
}

public class EmployeeSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt();

        Employee[] employees = new Employee[n];

        System.out.println("Enter employee details:");
        for (int i = 0; i < n; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            System.out.print("Employee Number: ");
            int enumber = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Employee Name: ");
            String ename = scanner.nextLine();
            System.out.print("Employee Salary: ");
            double esalary = scanner.nextDouble();

            employees[i] = new Employee(enumber, ename, esalary);
        }

        System.out.print("Enter the employee number to search: ");
        int searchEnumber = scanner.nextInt();

        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (employees[i].enumber == searchEnumber) {
                System.out.println("Employee Found:");
                System.out.println("Employee Number: " + employees[i].enumber);
                System.out.println("Employee Name: " + employees[i].ename);
                System.out.println("Employee Salary: " + employees[i].esalary);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee with number " + searchEnumber + " not found.");
        }

        scanner.close();
    }
}
