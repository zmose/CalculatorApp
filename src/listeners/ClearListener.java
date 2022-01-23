package listeners;

import java.awt.event.*;
import ui.panels.TextPanel;

public class ClearListener implements ActionListener{
    TextPanel textPanel;
    public ClearListener(TextPanel textPanel){
        this.textPanel = textPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        textPanel.resetText();        
    }
    
}
