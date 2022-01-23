package ui.panels;

import javax.swing.JButton;

import controller.CalcController;
import listeners.ClearListener;

public class ClearButton extends JButton{
    CalcController calcController;
    public ClearButton(TextPanel textPanel, CalcController calcController){
        super("Clear");
        this.calcController = calcController;
        this.addListener(textPanel);
    }
    
    private void addListener(TextPanel textPanel){
        ClearListener clearListener = new ClearListener(textPanel);
        this.addActionListener(clearListener);
    }
}
