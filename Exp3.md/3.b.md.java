STUDENT RECORD MANAGEMENT USING ARRAY LIST:

import java.util.ArrayList;
public class StudentRecordManagement {
public static void main(String[] args) {
ArrayList<String> studentNames = new ArrayList<>();
studentNames.add("Amit Sharma");
studentNames.add("Priya Verma");
studentNames.add("Rahul Singh");
studentNames.add("Sneha Patel");
System.out.println("List of Students:");
for (String name : studentNames) {
System.out.println(name);
}
System.out.println("\nTotal number of students: " + studentNames.size());

}
}

OUTPUT:
<img width="199" height="152" alt="Screenshot 2026-08-13 101742" src="https://github.com/user-attachments/assets/fc56f4b3-bf3c-4837-a275-12cc22b7fd0b" />
