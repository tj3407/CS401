package com.company.CheckBoxFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckBoxFrame extends JFrame {
    private final JTextField textField;
    private final JCheckBox boldJCheckbox;
    private final JCheckBox italicJCheckbox;

    public CheckBoxFrame() {
        super("JCheckBox Test");
        setLayout(new FlowLayout());

        textField = new JTextField("Watch the font style change", 20);
        textField.setFont(new Font("Serif", Font.PLAIN, 14));
        add(textField);

        boldJCheckbox = new JCheckBox("Bold");
        italicJCheckbox = new JCheckBox("Italic");
        add(boldJCheckbox);
        add(italicJCheckbox);

        CheckBoxHandler handler = new CheckBoxHandler();
        boldJCheckbox.addItemListener(handler);
        italicJCheckbox.addItemListener(handler);
    }

    private class CheckBoxHandler implements ItemListener {
        @Override
        public void itemStateChanged(ItemEvent e) {
            Font font = null;

            if (boldJCheckbox.isSelected() & italicJCheckbox.isSelected()) {
                font = new Font("Serif", Font.BOLD + Font.ITALIC, 14);
            } else if (boldJCheckbox.isSelected()) {
                font = new Font("Serif", Font.BOLD, 14);
            } else if (italicJCheckbox.isSelected()) {
                font = new Font("Serif", Font.ITALIC, 14);
            } else {
                font = new Font("Serif", Font.PLAIN, 14);
            }

            textField.setFont(font);
        }
    }
}
