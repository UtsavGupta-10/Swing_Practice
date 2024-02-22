package Layout_Managers;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.SwingUtilities;

public class Gridbaglayout {
    private JFrame frame;

    public Gridbaglayout() {
        frame = new JFrame("GridBagLayout Example");

        // Create buttons
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        JButton button4 = new JButton("Button 4");
        JButton button5 = new JButton("Button 5");

        // Set GridBagLayout for the frame
        frame.setLayout(new GridBagLayout());

        // Create GridBagConstraints
        GridBagConstraints gbc = new GridBagConstraints();

        // Add buttons to the frame using GridBagConstraints
        gbc.gridx = 0;
        gbc.gridy = 0;
        frame.add(button1, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        frame.add(button2, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2; // Make this component span across 2 columns
        frame.add(button3, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 1; // Reset gridwidth
        frame.add(button4, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        frame.add(button5, gbc);

        // Set the size of the frame
        frame.setSize(300, 200);

        // Set the default close operation (exit when closed)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the frame visible
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Create and show the GUI on the EDT (Event Dispatch Thread)
        SwingUtilities.invokeLater(Gridbaglayout::new);
    }
}
