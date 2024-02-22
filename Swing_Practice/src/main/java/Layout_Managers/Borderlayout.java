package Layout_Managers;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.SwingUtilities;

public class Borderlayout {
    private JFrame frame;

    public Borderlayout() {
        frame = new JFrame("BorderLayout Example");

        // Create buttons for each region
        JButton buttonNorth = new JButton("North");
        JButton buttonSouth = new JButton("South");
        JButton buttonEast = new JButton("East");
        JButton buttonWest = new JButton("West");
        JButton buttonCenter = new JButton("Center");

        // Add buttons to the frame with BorderLayout
        frame.add(buttonNorth, BorderLayout.NORTH);
        frame.add(buttonSouth, BorderLayout.SOUTH);
        frame.add(buttonEast, BorderLayout.EAST);
        frame.add(buttonWest, BorderLayout.WEST);
        frame.add(buttonCenter, BorderLayout.CENTER);

        // Set the size of the frame
        frame.setSize(400, 300);

        // Set the default close operation (exit when closed)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the frame visible
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Create and show the GUI on the EDT (Event Dispatch Thread)
        SwingUtilities.invokeLater(Borderlayout::new);
    }
}
