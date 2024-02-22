package Components;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Jbutton {
    private JFrame frame;

    public Jbutton() {
        frame = new JFrame("Button Example");
        JButton button = new JButton("Click Me!");
        button.setBounds(50, 50, 200, 100); // Set button bounds within the frame

        frame.getContentPane().setLayout(null); // Set layout to null for precise control
        frame.getContentPane().add(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200); // Set size of the frame
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Jbutton::new);
    }
}

