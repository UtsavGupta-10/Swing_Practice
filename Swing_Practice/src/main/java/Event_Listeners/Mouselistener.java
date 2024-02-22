package Event_Listeners;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Mouselistener {
    private JFrame frame;
    private JPanel panel;

    public Mouselistener() {
        frame = new JFrame("Simple MouseListener Example");

        // Create a JPanel
        panel = new JPanel();
        panel.setPreferredSize(new Dimension(300, 200));
        panel.setBackground(Color.WHITE);

        // Add a MouseListener to the JPanel
        panel.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Mouse Clicked at: (" + e.getX() + ", " + e.getY() + ")");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                System.out.println("Mouse Pressed at: (" + e.getX() + ", " + e.getY() + ")");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                System.out.println("Mouse Released at: (" + e.getX() + ", " + e.getY() + ")");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("Mouse Entered");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("Mouse Exited");
            }
        });

        // Add the panel to the frame
        frame.add(panel);

        // Set the size of the frame
        frame.setSize(300, 200);

        // Set the default close operation (exit when closed)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the frame visible
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Create and show the GUI on the Event Dispatch Thread (EDT)
        SwingUtilities.invokeLater(Mouselistener::new);
    }
}
