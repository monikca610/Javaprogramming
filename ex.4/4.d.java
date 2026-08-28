import javax.swing.*;
import java.awt.*;
public class Notepad extends JFrame {
JTextArea textArea;
Notepad() {
setTitle("Simple Notepad");
textArea = new JTextArea();
add(new JScrollPane(textArea), BorderLayout.CENTER);
setSize(400, 400);
setDefaultCloseOperation(EXIT_ON_CLOSE);
setVisible(true);
}
public static void main(String[] args) {
new Notepad();
}
}

OUTPUT:
A window titled "Simple Notepad" opens containing a
scrollable text area. The user can type and edit text
freely, for example:
This is a simple notepad using JTextArea.
It supports multiple lines and scrolling.
