LOGIN FORM USING AWT CONTROLS:

import java.awt.*;
import java.awt.event.*;
public class LoginForm extends Frame implements ActionListener {
TextField usernameField, passwordField;
Button loginButton;
LoginForm() {
setTitle("Login Form");
setLayout(new FlowLayout());
Label userLabel = new Label("Username:");
usernameField = new TextField(15);
Label passLabel = new Label("Password:");
passwordField = new TextField(15);
passwordField.setEchoChar('*');
loginButton = new Button("Login");
loginButton.addActionListener(this);
add(userLabel);
add(usernameField);
add(passLabel);

add(passwordField);
add(loginButton);
setSize(300, 200);
setVisible(true);
addWindowListener(new WindowAdapter() {
public void windowClosing(WindowEvent e) {
dispose();
}
});
}
public void actionPerformed(ActionEvent e) {
if (e.getSource() == loginButton) {
System.out.println("Username entered: " + usernameField.getText());
System.out.println("Login button clicked.");
}
}
public static void main(String[] args) {
new LoginForm();
}
}

OUTPUT:
<img width="357" height="156" alt="Screenshot 2026-08-13 102706" src="https://github.com/user-attachments/assets/3dea40f2-d898-40f8-8ea8-7dc247c52812" />
