package Layout_Managers;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.SwingUtilities;

public class Gridlayout {
    private JFrame frame;

    public Gridlayout() {
        frame = new JFrame("GridLayout Example");

        // Create buttons for each cell in the grid layout
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        JButton button4 = new JButton("Button 4");
        JButton button5 = new JButton("Button 5");
        JButton button6 = new JButton("Button 6");

        // Set GridLayout with 2 rows and 3 columns
        frame.setLayout(new GridLayout(2, 3));

        // Add buttons to the frame
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);

        // Set the size of the frame
        frame.setSize(400, 300);

        // Set the default close operation (exit when closed)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the frame visible
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Create and show the GUI on the EDT (Event Dispatch Thread)
        SwingUtilities.invokeLater(Gridlayout::new);
    }
}
