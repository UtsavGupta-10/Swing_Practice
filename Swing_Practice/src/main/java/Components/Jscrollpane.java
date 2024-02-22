package Components;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;

public class Jscrollpane {
    private JFrame frame;

    public Jscrollpane() {
        frame = new JFrame("JScrollPane Example");

        // Create a JTextArea
        JTextArea textArea = new JTextArea(10, 20);
        textArea.setText("This is a JTextArea with some text.\n".repeat(10)); // Add some text to make it scrollable

        // Create a JScrollPane and add the JTextArea to it
        JScrollPane scrollPane = new JScrollPane(textArea);

        // Set the preferred size of the scroll pane (optional)
        scrollPane.setPreferredSize(new java.awt.Dimension(300, 200));

        // Add the scroll pane to the frame
        frame.getContentPane().add(scrollPane);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack(); // Pack components within the frame
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Jscrollpane::new);
    }
}
