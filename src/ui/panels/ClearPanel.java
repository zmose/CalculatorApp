package ui.panels;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.*;


import controller.CalcController;
import listeners.ClearAllListener;
import listeners.ClearEntryListener;

public class ClearPanel extends JPanel{
    public ClearPanel(TextPanel textPanel, CalcController calcController){
        this.setLayout(new GridBagLayout());
        JButton clearEntryButton = this.createClearEntryButton(textPanel);
        this.add(clearEntryButton, this.getGBC(1, 0));
        JButton clearAllButton = this.createClearAllButton(textPanel, calcController);
        this.add(clearAllButton, this.getGBC(2, 0));
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

    private JButton createClearEntryButton(TextPanel textPanel){
        JButton clearEntryButton = new JButton("Clear Entry");
        ClearEntryListener clearEntryListener = new ClearEntryListener(textPanel);
        clearEntryButton.addActionListener(clearEntryListener);
        return clearEntryButton;
    }

    private JButton createClearAllButton(TextPanel textPanel, CalcController calcController) {
        JButton clearAllButton = new JButton("Clear All");
        ClearAllListener clearAllListener = new ClearAllListener(textPanel, calcController);
        clearAllButton.addActionListener(clearAllListener);
        return clearAllButton;
    }
}
