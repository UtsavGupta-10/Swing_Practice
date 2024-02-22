package Components;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingUtilities;

public class Jscrollbar {
    private JFrame frame;

    public Jscrollbar() {
        frame = new JFrame("JScrollBar Example");

        // Create a JTextArea
        JTextArea textArea = new JTextArea(10, 20); // 10 rows, 20 columns

        // Create a JScrollPane and add the JTextArea to it
        JScrollPane scrollPane = new JScrollPane(textArea);

        // Set the policy for vertical scrollbar to always appear
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        // Add the scroll pane to the frame
        frame.getContentPane().add(scrollPane);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Jscrollbar::new);
    }
}
