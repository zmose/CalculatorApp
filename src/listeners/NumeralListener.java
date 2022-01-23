package listeners;

import java.awt.event.*;
import ui.panels.TextPanel;

public class NumeralListener implements ActionListener{
    private TextPanel textPanel;

    public NumeralListener(TextPanel textPanel){
        this.textPanel = textPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String numeral = e.getActionCommand();
        this.textPanel.updateText(numeral);
        
    }
    
}
