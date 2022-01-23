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

    public void updateText(String s){
        if(this.getText().equals("0")){
            this.setText(s);
        }
        else {
            this.setText(this.getText() + s);
        }
    }

    public void resetText(){
        this.setText("0");
    }
}
