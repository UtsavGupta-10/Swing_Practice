package Components;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class Jlabel{
    private JFrame frame;

    public Jlabel() {
        frame = new JFrame("JLabel Example");
        JLabel label = new JLabel("Hello, World!");
        label.setBounds(50, 50, 200, 50); // Set label bounds within the frame

        frame.getContentPane().setLayout(null); // Set layout to null for precise control
        frame.getContentPane().add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200); // Set size of the frame
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Jlabel::new);
    }
}
