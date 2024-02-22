package Components;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;

public class Jlist {
    private JFrame frame;

    public Jlist() {
        frame = new JFrame("JList Example");

        // Create a DefaultListModel to hold the data
        DefaultListModel<String> listModel = new DefaultListModel<>();
        listModel.addElement("Item 1");
        listModel.addElement("Item 2");
        listModel.addElement("Item 3");
        listModel.addElement("Item 4");

        // Create the JList with the DefaultListModel
        JList<String> list = new JList<>(listModel);

        // Create a scroll pane to hold the JList
        JScrollPane scrollPane = new JScrollPane(list);

        // Set bounds for the scroll pane
        scrollPane.setBounds(50, 50, 200, 150);

        // Add the scroll pane to the frame
        frame.getContentPane().setLayout(null);
        frame.getContentPane().add(scrollPane);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 250); // Set size of the frame
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Jlist::new);
    }
}
