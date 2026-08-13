EMPLOYEE NAME FORMATTER USING STRING HANDLING:

public class EmployeeNameFormatter {
public static void main(String[] args) {
String emp1 = "john smith";
String emp2 = "John Smith";
System.out.println("Employee 1 Name : " + emp1);
System.out.println("Employee 2 Name : " + emp2);
System.out.println("Length of Employee 1 name: " + emp1.length());
System.out.println("Length of Employee 2 name: " + emp2.length());
System.out.println("Employee 1 in Uppercase : " + emp1.toUpperCase());
System.out.println("Employee 2 in Uppercase : " + emp2.toUpperCase());
System.out.println("Employee 1 in Lowercase : " + emp1.toLowerCase());
System.out.println("Employee 2 in Lowercase : " + emp2.toLowerCase());
System.out.println("Names equal (case-sensitive) ? " + emp1.equals(emp2));
System.out.println("Names equal (ignoring case) ? " + emp1.equalsIgnoreCase(emp2));
}
}

OUTPUT:
<img width="261" height="213" alt="Screenshot 2026-08-13 101403" src="https://github.com/user-attachments/assets/3f08e93c-ad49-4d2b-a6ea-54595d6aa411" />
