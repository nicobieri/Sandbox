package src.ch.teko.nb.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.nio.file.attribute.UserDefinedFileAttributeView;

public class Box extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JComboBox comboBox1;
    private JButton button1;
    private JTextArea textArea1;

    public Box() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);



        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);


        comboBox1.addItemListener(new ItemListener() {


            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    int idx = comboBox1.getSelectedIndex();

           //         java.awt.CardLayout cl = (java.awt.CardLayout) cardPanel.getLayout();
                    java.awt.CardLayout cl = (java.awt.CardLayout) comboBox1.getLayout();
                    switch (idx){
                        case  0: cl.show(comboBox1, "card1"); break;
                        case  1: cl.show(comboBox1, "card2"); break;
                    }
                }
            }
        });
    }

    private void onOK() {
        // add your code here
        dispose();
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

    public static void main(String[] args) {
        Box dialog = new Box();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
