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

        // if the operation is '=', we want to actually perform the action
        // and send the result to the textPanel
        if(operator.equals("=")){
            this.textPanel.setText(Double.toString(this.calcController.performOperation()));
            this.textPanel.setIsReadyToReset(true);
            this.calcController.setPreviousCharWasEquals(true);
            return;
        }

        calcController.setOp(operator);  
        this.textPanel.setIsReadyToReset(true);
    }

    /**
     * Populates either register 1 or 2 based on bits inside the controller:
     * 
     * If the first bit is already populated AND the previous character was NOT '=',
     * populate register 2.
     * 
     * Otherwise, populate register 1. 
     * @param register
     */
    private void populateReg(String register){
        if(calcController.isFirstRegPopulated() && !calcController.getPreviousCharWasEquals()){
            calcController.setReg2(register);
        }
        else {
            calcController.setReg1(register);
        }
    }
    
}
