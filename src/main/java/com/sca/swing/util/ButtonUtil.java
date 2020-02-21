package com.sca.swing.util;

import javax.swing.*;

public class ButtonUtil {
    public static JButton newButton(String name, String text) {
        JButton button = new JButton(text);
        button.setName(name);
        return button;
    }

    public static void addActionToButton(JButton button, final Runnable action) {
        button.addActionListener(e -> action.run());
    }
}
