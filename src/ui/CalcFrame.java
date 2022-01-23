package ui;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

import controller.CalcController;
import ui.panels.ButtonPanel;
import ui.panels.ClearPanel;
import ui.panels.TextPanel;

public class CalcFrame extends JFrame {
    private final int NUMBER_OF_VERTICAL_PANELS = 3;

    public CalcFrame() {
        JPanel mainPanel = this.createParentPanel(NUMBER_OF_VERTICAL_PANELS);
        this.add(mainPanel, BorderLayout.CENTER);
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
        panel.setLayout(new GridBagLayout());
        this.addSubPanels(panel);
        return panel;

    }

    private void addSubPanels(JPanel panel) {

        // unfortunately yes you do need to pass in TextPanel to
        // actually change the text
        CalcController calcController = new CalcController();
        TextPanel textPanel = new TextPanel(16);
        ButtonPanel buttonPanel = new ButtonPanel(textPanel, calcController);
        ClearPanel clearPanel = new ClearPanel(textPanel, calcController);

        panel.add(textPanel, this.getGBC(0, 1));
        panel.add(buttonPanel, this.getGBC(0, 2));
        panel.add(clearPanel, this.getGBC(0, 3));
    }

    private GridBagConstraints getGBC(int x, int y){
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.NORTH;
        gbc.weighty = 1;
        gbc.gridx = x;
        gbc.gridy = y;
        gbc.insets = new Insets(10, 2, 10, 2);
        return gbc;
    }
}
