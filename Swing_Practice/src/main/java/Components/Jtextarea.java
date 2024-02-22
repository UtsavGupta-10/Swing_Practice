package Components;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;

public class Jtextarea {
    private JFrame frame;

    public Jtextarea() {
        frame = new JFrame("JTextArea Example");
        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea); // Add scroll pane for text area
        scrollPane.setBounds(50, 50, 200, 100); // Set bounds for scroll pane

        frame.getContentPane().setLayout(null); // Set layout to null for precise control
        frame.getContentPane().add(scrollPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200); // Set size of the frame
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Jtextarea::new);
    }
}
