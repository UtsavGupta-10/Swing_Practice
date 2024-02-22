package Event_Listeners;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Windowlistener {
    private JFrame frame;

    public Windowlistener() {
        frame = new JFrame("Simple WindowListener Example");

        // Add a WindowListener to the frame
        frame.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {
                System.out.println("Window Opened!");
            }

            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Window Closing!");
            }

            @Override
            public void windowClosed(WindowEvent e) {
                System.out.println("Window Closed!");
            }

            @Override
            public void windowIconified(WindowEvent e) {
                System.out.println("Window Iconified!");
            }

            @Override
            public void windowDeiconified(WindowEvent e) {
                System.out.println("Window Deiconified!");
            }

            @Override
            public void windowActivated(WindowEvent e) {
                System.out.println("Window Activated!");
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                System.out.println("Window Deactivated!");
            }
        });

        // Set the size of the frame
        frame.setSize(300, 200);

        // Set the default close operation (exit when closed)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the frame visible
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Create and show the GUI on the EDT (Event Dispatch Thread)
        SwingUtilities.invokeLater(Windowlistener::new);
    }
}
