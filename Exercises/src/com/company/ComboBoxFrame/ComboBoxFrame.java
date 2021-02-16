package com.company.ComboBoxFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ComboBoxFrame extends JFrame {

    private final JComboBox<String> imagesJComboBox;
    private final JLabel label;

    private static final String[] names = {"bug1.gif", "bug2.gif", "travelbug.gif", "buganim.gif"};
    private final Icon[] icons = {
        new ImageIcon(getClass().getResource(names[0])),
        new ImageIcon(getClass().getResource(names[1])),
        new ImageIcon(getClass().getResource(names[2])),
        new ImageIcon(getClass().getResource(names[3]))
    };

    public ComboBoxFrame() {
        super("Testing JComboBox");
        setLayout(new FlowLayout());

        imagesJComboBox = new JComboBox<>(names);
        imagesJComboBox.setMaximumRowCount(3);

        imagesJComboBox.addItemListener(
                new ItemListener() {
                    @Override
                    public void itemStateChanged(ItemEvent event) {
                        if (event.getStateChange() == ItemEvent.SELECTED) {
                            label.setIcon(icons[imagesJComboBox.getSelectedIndex()]);
                        }
                    }
                }
        );

        add(imagesJComboBox);
        label = new JLabel(icons[0]);
        add(label);
    }
}
