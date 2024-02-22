package Components;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Jcombobox {
    private JFrame frame;

    public Jcombobox() {
        frame = new JFrame("JComboBox Example");

        String[] options = {"Option 1", "Option 2", "Option 3", "Option 4"};
        JComboBox<String> comboBox = new JComboBox<>(options);
        comboBox.setBounds(50, 50, 200, 30); // Set combo box bounds within the frame

        frame.getContentPane().setLayout(null); // Set layout to null for precise control
        frame.getContentPane().add(comboBox);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200); // Set size of the frame
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Jcombobox::new);
    }
}
