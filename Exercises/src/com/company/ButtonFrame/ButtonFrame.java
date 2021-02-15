package com.company.ButtonFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonFrame extends JFrame {
    private final JButton plainJButton;
    private final JButton fancyJButton;

    public ButtonFrame() {
        super("Testing Buttons");
        setLayout(new FlowLayout());

        plainJButton = new JButton("Plain Button");
        add(plainJButton);

        Icon bug1 = new ImageIcon(getClass().getResource("bug.png"));
        Icon bug2 = new ImageIcon(getClass().getResource("bug.png"));
        fancyJButton = new JButton("Fancy Button", bug1);
        fancyJButton.setRolloverIcon(bug2);
        add(fancyJButton);

        ButtonHandler handler = new ButtonHandler();
        fancyJButton.addActionListener(handler);
        plainJButton.addActionListener(handler);
    }

    private class ButtonHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent event) {
            JOptionPane.showMessageDialog(ButtonFrame.this, String.format("You pressed: %s", event.getActionCommand()));
        }
    }
}
