package Components;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Jcheckbox {
    private JFrame frame;

    public Jcheckbox() {
        frame = new JFrame("JCheckBox Example");
        JCheckBox checkBox = new JCheckBox("Enable Feature X");
        checkBox.setBounds(50, 50, 200, 30); // Set checkbox bounds within the frame

        frame.getContentPane().setLayout(null); // Set layout to null for precise control
        frame.getContentPane().add(checkBox);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200); // Set size of the frame
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Jcheckbox::new);
    }
}
