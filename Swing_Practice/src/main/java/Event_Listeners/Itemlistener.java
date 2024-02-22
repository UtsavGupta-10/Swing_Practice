package Event_Listeners;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Itemlistener {
    private JFrame frame;

    public Itemlistener() {
        frame = new JFrame("Simple ItemListener Example");

        // Create a checkbox
        JCheckBox checkBox = new JCheckBox("Check Me");

        // Add an ItemListener to the checkbox
        checkBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    System.out.println("Checkbox Selected!");
                } else if (e.getStateChange() == ItemEvent.DESELECTED) {
                    System.out.println("Checkbox Deselected!");
                }
            }
        });

        // Add the checkbox to the frame
        frame.add(checkBox);

        // Set the size of the frame
        frame.setSize(300, 200);

        // Set the default close operation (exit when closed)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the frame visible
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Create and show the GUI on the EDT (Event Dispatch Thread)
        SwingUtilities.invokeLater(Itemlistener::new);
    }
}
