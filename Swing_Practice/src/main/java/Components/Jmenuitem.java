package Components;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;

public class Jmenuitem {
    private JFrame frame;

    public Jmenuitem() {
        frame = new JFrame("JMenuItem Example");

        // Create a menu bar
        JMenuBar menuBar = new JMenuBar();

        // Create a menu
        JMenu menu = new JMenu("File");

        // Create a menu item
        JMenuItem menuItem = new JMenuItem("Open");

        // Add the menu item to the menu
        menu.add(menuItem);

        // Add the menu to the menu bar
        menuBar.add(menu);

        // Set the menu bar for the frame
        frame.setJMenuBar(menuBar);

        // Set the size of the frame
        frame.setSize(400, 300);

        // Set the default close operation (exit when closed)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the frame visible
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Create and show the GUI on the EDT (Event Dispatch Thread)
        SwingUtilities.invokeLater(Jmenuitem::new);
    }
}
