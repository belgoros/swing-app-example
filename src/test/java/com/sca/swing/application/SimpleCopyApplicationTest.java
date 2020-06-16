package com.sca.swing.application;

import org.assertj.swing.edt.FailOnThreadViolationRepaintManager;
import org.assertj.swing.edt.GuiActionRunner;
import org.assertj.swing.fixture.FrameFixture;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SimpleCopyApplicationTest {
    private FrameFixture window;

    @BeforeClass
    public static void setUpOnce() {
        FailOnThreadViolationRepaintManager.install();
    }

    @Before
    public void setUp() {
        SimpleCopyApplication frame = GuiActionRunner.execute(() -> new SimpleCopyApplication());
        window = new FrameFixture(frame);
        window.show(); // shows the frame to test
    }

    @Test
    public void shouldCopyTextInLabelWhenClickingButton() {
        window.textBox("textToCopy").enterText("hello");
        window.button("copyButton").click();
        window.label("copiedText").requireText("hello");
    }

    @After
    public void tearDown() {
        window.cleanUp();
    }
}
