import java.util.Scanner;
public class StudentInfo {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter student name: ");
String name = sc.nextLine();
System.out.print("Enter roll number: ");
int rollNo = sc.nextInt();
System.out.print("Enter marks: ");
double marks = sc.nextDouble();
System.out.println();
System.out.println("----- Student Details -----");
System.out.println("Name : " + name);
System.out.println("Roll Number: " + rollNo);
System.out.println("Marks : " + marks);
sc.close();
}
}

OUTPUT:
Enter student name: Ramesh
Enter roll number: 101
Enter marks: 89.5
----- Student Details -----
Name : Ramesh
Roll Number: 101
Marks : 89.5
