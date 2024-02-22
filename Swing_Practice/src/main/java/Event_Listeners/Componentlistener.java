package Event_Listeners;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

public class Componentlistener {
    private JFrame frame;

    public Componentlistener() {
        frame = new JFrame("Simple ComponentListener Example");

        // Create a JPanel
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(200, 200));
        panel.setBackground(Color.BLUE);

        // Add a ComponentListener to the panel
        panel.addComponentListener(new ComponentListener() {
            @Override
            public void componentResized(ComponentEvent e) {
                System.out.println("Panel Resized: " + panel.getSize());
            }

            @Override
            public void componentMoved(ComponentEvent e) {
                System.out.println("Panel Moved: " + panel.getLocation());
            }

            @Override
            public void componentShown(ComponentEvent e) {
                System.out.println("Panel Shown");
            }

            @Override
            public void componentHidden(ComponentEvent e) {
                System.out.println("Panel Hidden");
            }
        });

        // Add the panel to the frame
        frame.add(panel);

        // Set the size of the frame
        frame.setSize(300, 300);

        // Set the default close operation (exit when closed)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the frame visible
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Create and show the GUI on the EDT (Event Dispatch Thread)
        SwingUtilities.invokeLater(Componentlistener::new);
    }
}
