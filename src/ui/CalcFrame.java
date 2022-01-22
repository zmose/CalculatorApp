package ui;

import java.awt.*;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

import ui.panels.ButtonPanel;
import ui.panels.TextPanel;

public class CalcFrame extends JFrame {
    private final int NUMBER_OF_VERTICAL_PANELS = 3;

    public CalcFrame() {
        JPanel mainPanel = this.createParentPanel(NUMBER_OF_VERTICAL_PANELS);
        this.add(mainPanel);
        this.createFrame();
    }
    /**
     * final step in creating the frame for the calculator
     */
    private void createFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Calculator");
        this.pack();
        this.setVisible(true);
        return;
    }
    
    /** 
     * Creates the main panel and the sub panels
     * @param numberOfPanels
     * @return JPanel
     */
    private JPanel createParentPanel(int numberOfPanels){
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(100, 100, 100, 100));
        panel.setLayout(new GridLayout(numberOfPanels, 1));
        panel.add(new TextPanel(16), 0, 0);
        panel.add(new ButtonPanel());
        return panel;

    }
}
