package listeners;

import java.awt.event.*;
import controller.CalcController;
import ui.panels.TextPanel;

public class OpListener implements ActionListener{
    TextPanel textPanel;
    CalcController calcController;

    public OpListener(TextPanel textPanel, CalcController calcController){
        this.textPanel = textPanel;
        this.calcController = calcController;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.populateReg(textPanel.getText());

        String operator = e.getActionCommand();

        if(operator.equals("=")){
            this.textPanel.setText(Double.toString(this.calcController.performOperation()));
            this.textPanel.setIsReadyToReset(true);
            return;
        }

        calcController.setOp(operator);  
        this.textPanel.resetText();
    }

    private void populateReg(String register){
        if(calcController.isFirstRegPopulated()){
            calcController.setReg2(register);
        }
        else {
            calcController.setReg1(register);
        }
    }
    
}
