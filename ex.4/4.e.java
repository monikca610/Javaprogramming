import javax.swing.*;
public class EmployeeMenu extends JFrame {

EmployeeMenu() {
setTitle("Employee Management");
JMenuBar menuBar = new JMenuBar();
JMenu fileMenu = new JMenu("File");
JMenu editMenu = new JMenu("Edit");
JMenu helpMenu = new JMenu("Help");
JMenuItem addItem = new JMenuItem("Add Employee");
JMenuItem exitItem = new JMenuItem("Exit");
fileMenu.add(addItem);
fileMenu.add(exitItem);
JMenuItem updateItem = new JMenuItem("Update Employee");
editMenu.add(updateItem);
JMenuItem aboutItem = new JMenuItem("About");
helpMenu.add(aboutItem);
menuBar.add(fileMenu);
menuBar.add(editMenu);
menuBar.add(helpMenu);
setJMenuBar(menuBar);
exitItem.addActionListener(e -> System.exit(0));
aboutItem.addActionListener(e ->
JOptionPane.showMessageDialog(this,
"Employee Management System v1.0"));
setSize(400, 300);
setDefaultCloseOperation(EXIT_ON_CLOSE);
setVisible(true);
}
public static void main(String[] args) {
new EmployeeMenu();
}
}

OUTPUT:
A window titled "Employee Management" opens with a
menu bar: File | Edit | Help
File -> Add Employee, Exit
Edit -> Update Employee
Help -> About
Clicking Help -> About shows a dialog:
"Employee Management System v1.0"
