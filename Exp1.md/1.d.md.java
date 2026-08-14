 Payroll System using Access Specifiers:

 // Java program to demonstrate private data members and public methods

class Student {
    // Private data members
    private int rollNo;
    private String name;

    // Public method to set student details
    public void setDetails(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    // Public method to display student details
    public void displayDetails() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }
}

public class Main {
    public static void main(String[] args) {

        Student student = new Student();

        // Accessing private data through public method
        student.setDetails(101, "Rahul");
        student.displayDetails();
    }
}

OUTPUT:
<img width="106" height="49" alt="Screenshot 2026-08-13 120715" src="https://github.com/user-attachments/assets/a42692ed-093b-46ac-bedf-00c021f29df7" />
