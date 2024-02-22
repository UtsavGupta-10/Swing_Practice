package Layout_Managers;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Boxlayout {
    private JFrame frame;

    public Boxlayout() {
        frame = new JFrame("BoxLayout Example");

        // Create buttons
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");

        // Create a vertical box to hold the buttons
        Box verticalBox = Box.createVerticalBox();
        verticalBox.add(button1);
        verticalBox.add(button2);
        verticalBox.add(button3);

        // Set BoxLayout for the frame with vertical alignment
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));

        // Add the vertical box to the frame
        frame.add(verticalBox);

        // Set the size of the frame
        frame.setSize(300, 200);

        // Set the default close operation (exit when closed)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the frame visible
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Create and show the GUI on the EDT (Event Dispatch Thread)
        SwingUtilities.invokeLater(Boxlayout::new);
    }
}
