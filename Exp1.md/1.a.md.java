Employee Management System :

// Java program to create an Employee class

class Employee {
    int employeeId;
    String name;
    double salary;

    // Constructor to initialize employee details
    Employee(int employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }

    // Method to display employee details
    void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }
}

public class Main {
    public static void main(String[] args) {

        // Creating Employee object using constructor
        Employee emp = new Employee(101, "Rahul", 50000);

        // Display employee details
        emp.displayDetails();
    }
}

OUTPUT:
<img width="193" height="56" alt="Screenshot 2026-08-13 113207" src="https://github.com/user-attachments/assets/425d536b-ae39-4e94-b915-f719b242bbbe" />


