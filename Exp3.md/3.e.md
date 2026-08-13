STUDENT REGISTRATION FORM USING GRIDLAYOUT:

import java.awt.*;
public class StudentRegistrationForm extends Frame {
StudentRegistrationForm() {
setTitle("Student Registration Form");
setLayout(new GridLayout(5, 2, 10, 10));
add(new Label("Name:"));
add(new TextField());
add(new Label("Roll Number:"));
add(new TextField());
add(new Label("Class:"));
add(new TextField());
add(new Label("Email:"));
add(new TextField());
add(new Label(""));
add(new Button("Register"));
setSize(350, 250);
setVisible(true);
}
public static void main(String[] args) {
new StudentRegistrationForm();
}
}

OUTPUT:
<img width="282" height="179" alt="Screenshot 2026-08-13 102909" src="https://github.com/user-attachments/assets/04009318-fa6b-4f98-b36e-059b509944eb" />
