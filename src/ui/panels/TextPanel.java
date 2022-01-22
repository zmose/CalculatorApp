package ui.panels;

import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class TextPanel extends JTextField {
    
    public TextPanel(int columns){
        super(columns);
        this.setHorizontalAlignment(SwingConstants.RIGHT);
        this.setText("0");
        this.setEditable(false);
    }
}
