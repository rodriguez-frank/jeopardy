package view;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class QuestionPanel extends JPanel {

    private final String val;
    private boolean showText;

    /**
     * Make a panel for a single question.
     */
    public QuestionPanel(String val) {
        super();

        // border and bg color
        Border whiteLine = BorderFactory.createLineBorder(Color.WHITE);
        this.setBackground(Color.BLUE);
        this.setBorder(whiteLine);

        this.val = val;
        this.showText = true;
    }

    /**
     * Make the panel show the value or not if answered.
     */
    public void drawPanel() {
        JLabel valText = new JLabel(this.val);

        if (this.showText) {
            this.add(valText, BorderLayout.CENTER);
        }
    }

    /**
     * Clear the panel.
     */
    public void clearPanel() {
        this.showText = false;
    }

}
