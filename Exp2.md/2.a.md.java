 Employee Management using Packages and Access Specifiers:

 // File: employee/Employee.java
package employee;

public class Employee {
    // Private data members
    private int id;
    private String name;
    private double salary;

    // Public methods to set employee details
    public void setDetails(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Public methods to access employee details
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}
// File: test/TestEmployee.java
package test;

import employee.Employee;

public class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee();

        emp.setDetails(101, "Rahul", 50000);

        System.out.println("Employee ID: " + emp.getId());
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Salary: " + emp.getSalary());
    }
}

OUTPUT:
<img width="211" height="70" alt="Screenshot 2026-08-13 112029" src="https://github.com/user-attachments/assets/b98b2658-98ac-4e23-baf7-9d71e2c57eb9" />
