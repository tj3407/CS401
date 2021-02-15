package com.company.LabelFrameGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class LabelFrameGUI extends JFrame {
    private final JLabel label1;
    private final JLabel label2;
    private final JLabel label3;

    public LabelFrameGUI() {
        super("Testing JLabel");
        setLayout(new FlowLayout());

        label1 = new JLabel("Label with text");
        label1.setToolTipText("This is label1");
        add(label1);

        Icon bug = new ImageIcon(getClass().getResource("bug.png"));
        label2 = new JLabel("Label with text and icon", bug, SwingConstants.LEFT);
        label2.setToolTipText("This is label2");
        add(label2);

        label3 = new JLabel();
        label3.setText("Label with icon and text at the bottom");
        label3.setIcon(bug);
        label3.setHorizontalTextPosition(SwingConstants.CENTER);
        label3.setVerticalTextPosition(SwingConstants.BOTTOM);
        label3.setToolTipText("This is label3");
        add(label3);
    }
}
