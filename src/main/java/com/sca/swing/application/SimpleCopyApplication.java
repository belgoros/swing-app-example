package com.sca.swing.application;

import com.sca.swing.components.SampleFrame;
import net.miginfocom.layout.AC;
import net.miginfocom.layout.LC;

import static com.sca.swing.util.ButtonUtil.addActionToButton;
import static com.sca.swing.util.ButtonUtil.newButton;
import static com.sca.swing.util.LabelUtil.newLabel;
import static com.sca.swing.util.TextFieldUtil.newTextField;
import static javax.swing.SwingUtilities.invokeAndWait;

import java.lang.reflect.InvocationTargetException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class SimpleCopyApplication extends SampleFrame {
    private static final long serialVersionUID = 1L;

    public SimpleCopyApplication() {
        setMiglayout(new LC().wrapAfter(1), new AC().align("center"), new AC());

        final JTextField textField = newTextField("textToCopy");
        JButton button = newButton("copyButton", "Copy text to label");
        final JLabel label = newLabel("copiedText");

        addActionToButton(button, new Runnable() {

            @Override
            public void run() {
                label.setText(textField.getText());
            }
        });

        add(textField);
        add(button);
        add(label);

        pack();
    }

    public static void main(String[] args) throws InvocationTargetException, InterruptedException {
        invokeAndWait(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new SimpleCopyApplication();
                frame.setVisible(true);
            }
        });
    }
}
