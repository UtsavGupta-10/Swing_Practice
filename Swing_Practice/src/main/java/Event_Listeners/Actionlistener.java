package Event_Listeners;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Actionlistener {
    private JFrame frame;

    public Actionlistener() {
        frame = new JFrame("Simple ActionListener Example");

        // Create a button
        JButton button = new JButton("Click Me");

        // Add an ActionListener to the button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button Clicked!");
            }
        });

        // Add the button to the frame
        frame.add(button);

        // Set the size of the frame
        frame.setSize(300, 200);

        // Set the default close operation (exit when closed)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the frame visible
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Create and show the GUI on the EDT (Event Dispatch Thread)
        SwingUtilities.invokeLater(Actionlistener::new);
    }
}
