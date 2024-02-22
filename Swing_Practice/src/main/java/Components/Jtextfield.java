package Components;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Jtextfield {
    private JFrame frame;

    public Jtextfield() {
        frame = new JFrame("JTextField Example");
        JTextField textField = new JTextField();
        textField.setBounds(50, 50, 200, 30); // Set text field bounds within the frame

        frame.getContentPane().setLayout(null); // Set layout to null for precise control
        frame.getContentPane().add(textField);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200); // Set size of the frame
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Jtextfield::new);
    }
}
