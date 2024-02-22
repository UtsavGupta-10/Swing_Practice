package Components;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;

public class Jtable {
    private JFrame frame;

    public Jtable() {
        frame = new JFrame("JTable Example");

        // Data for the table (2D array representing rows and columns)
        Object[][] data = {
            {"Ayush", 22, "Male"},
            {"Rashi", 22, "Female"},
            {"Aditya", 22, "Male"},
            {"Preeti", 27, "Female"}
        };

        // Column names
        String[] columns = {"Name", "Age", "Gender"};

        // Create the table with data and columns
        JTable table = new JTable(data, columns);

        // Create a scroll pane to hold the table
        JScrollPane scrollPane = new JScrollPane(table);

        // Set bounds for the scroll pane
        scrollPane.setBounds(50, 50, 300, 150);

        // Add the scroll pane to the frame
        frame.getContentPane().setLayout(null);
        frame.getContentPane().add(scrollPane);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300); // Set size of the frame
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Jtable::new);
    }
}
