package Components;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Jframe {
    public Jframe() {
        // Create a new JFrame
        JFrame frame = new JFrame("My JFrame Example");

        // Set the size of the frame
        frame.setSize(400, 300);

        // Set the default close operation (exit when closed)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the frame visible
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Create and show the GUI on the EDT (Event Dispatch Thread)
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Jframe();
            }
        });
    }
}
