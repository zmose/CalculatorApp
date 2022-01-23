package listeners;

import java.awt.event.*;
import ui.panels.TextPanel;

public class ClearEntryListener implements ActionListener{
    TextPanel textPanel;
    public ClearEntryListener(TextPanel textPanel){
        this.textPanel = textPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        textPanel.resetText();        
    }
    
}
