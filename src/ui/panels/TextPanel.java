package ui.panels;

import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class TextPanel extends JTextField {

    private boolean isReadyToReset = false;
    
    public TextPanel(int columns){
        super(columns);
        this.setHorizontalAlignment(SwingConstants.RIGHT);
        this.setText("0");
        this.setEditable(false);
    }

    public void updateText(String s){
        if(this.isReadyToReset){
            this.setText(s);
            this.setIsReadyToReset(false);
            return;
        }
        if(this.getText().equals("0") && !s.equals(".")){
            this.setText(s);
        }
        else if(!(s.equals(".") && this.getText().contains("."))){
            this.setText(this.getText() + s);
        }
    }

    public void resetText(){
        this.setText("0");
    }

    public boolean getIsReadyToReset(){
        return this.isReadyToReset;
    }

    public void setIsReadyToReset(boolean b){
        this.isReadyToReset = b;
    }
}
