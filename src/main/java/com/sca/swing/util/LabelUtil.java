package com.sca.swing.util;

import javax.swing.*;

public class LabelUtil {
    public static JLabel newLabel(String name) {
        return newLabel(name, " ");
    }

    public static JLabel newLabel(String name, String text) {
        JLabel label = new JLabel(text);
        label.setName(name);
        return label;
    }
}
