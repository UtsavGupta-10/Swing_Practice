package Components;

import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.SwingUtilities;

public class Jpasswordfield {
    private JFrame frame;

    public Jpasswordfield() {
        frame = new JFrame("JPasswordField Example");
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(50, 50, 200, 30); // Set password field bounds within the frame

        frame.getContentPane().setLayout(null); // Set layout to null for precise control
        frame.getContentPane().add(passwordField);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200); // Set size of the frame
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Jpasswordfield::new);
    }
}
