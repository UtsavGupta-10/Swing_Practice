package Components;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.SwingUtilities;

public class Jradiobutton {
    private JFrame frame;

    public Jradiobutton() {
        frame = new JFrame("JRadioButton Example");
        
        JRadioButton radioButton1 = new JRadioButton("Option 1");
        JRadioButton radioButton2 = new JRadioButton("Option 2");
        JRadioButton radioButton3 = new JRadioButton("Option 3");

        radioButton1.setBounds(50, 50, 200, 30);
        radioButton2.setBounds(50, 80, 200, 30);
        radioButton3.setBounds(50, 110, 200, 30);

        ButtonGroup group = new ButtonGroup();
        group.add(radioButton1);
        group.add(radioButton2);
        group.add(radioButton3);

        frame.getContentPane().setLayout(null);
        frame.getContentPane().add(radioButton1);
        frame.getContentPane().add(radioButton2);
        frame.getContentPane().add(radioButton3);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Jradiobutton::new);
    }
}

