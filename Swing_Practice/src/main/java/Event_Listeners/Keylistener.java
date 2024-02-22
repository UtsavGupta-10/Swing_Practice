package Event_Listeners;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Keylistener {
    private JFrame frame;
    private JTextField textField;

    public Keylistener() {
        frame = new JFrame("Simple KeyListener Example");

        // Create a JTextField
        textField = new JTextField();
        textField.setColumns(20);

        // Add a KeyListener to the JTextField
        textField.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println("Key Typed: " + e.getKeyChar());
            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println("Key Pressed: " + e.getKeyCode());
            }

            @Override
            public void keyReleased(KeyEvent e) {
                System.out.println("Key Released: " + e.getKeyCode());
            }
        });

        // Add the text field to the frame
        frame.add(textField);

        // Set the size of the frame
        frame.setSize(300, 200);

        // Set the default close operation (exit when closed)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the frame visible
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Create and show the GUI on the Event Dispatch Thread (EDT)
        SwingUtilities.invokeLater(Keylistener::new);
    }
}
