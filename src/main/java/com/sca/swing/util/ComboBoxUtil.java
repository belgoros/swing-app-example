package com.sca.swing.util;

import javax.swing.*;

public class ComboBoxUtil {
    public static JComboBox<String> newBox(String name, String... items) {
        JComboBox<String> box = new JComboBox<>(items);
        box.setName(name);
        return box;
    }
}
