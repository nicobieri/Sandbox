package src.ch.teko.nb.swing;

import javax.swing.*;
import java.awt.BorderLayout;

public class Border {
    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("BorderLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);

        panel.setLayout(new BorderLayout(20, 2));

        JToolBar toolBar = new JToolBar();
        toolBar.add(new JButton("North -1"));
        panel.add(toolBar, BorderLayout.NORTH);
        toolBar.addSeparator();
        toolBar.add(new JButton("North -2"));
        toolBar.add(new JComboBox(new String[]{"A", "B", "C"}));

        panel.add(toolBar,BorderLayout.NORTH);

        //panel.add(new JButton("NORTH"), BorderLayout.NORTH);
        panel.add(new JButton("SOUTH"), BorderLayout.SOUTH);
        panel.add(new JButton("WEST"), BorderLayout.WEST);
        panel.add(new JButton("EAST"), BorderLayout.EAST);
        panel.add(new JLabel("CENTER"), BorderLayout.CENTER);



        frame.pack();
        frame.setVisible(true);

    }
}
