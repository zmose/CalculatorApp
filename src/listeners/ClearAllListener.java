package listeners;

import java.awt.event.*;

import controller.CalcController;
import ui.panels.TextPanel;

public class ClearAllListener implements ActionListener{
    TextPanel textPanel;
    CalcController calcController;
    public ClearAllListener(TextPanel textPanel, CalcController calcController){
        this.textPanel = textPanel;
        this.calcController = calcController;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.calcController.resetAll();    
        this.textPanel.resetText();    
    }
    
}
