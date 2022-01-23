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

    /**
     * Updates the text in the text field.
     * @param s
     */
    public void updateText(String s){

        // check reset flag
        if(this.isReadyToReset){
            this.resetText();
            this.setIsReadyToReset(false);
        }

        // alternate sign
        if(s.equals("+/-")){
            if(this.getText().charAt(0) == '-'){
                this.setText(this.getText().substring(1));
            }
            else {
                this.setText('-' + this.getText());
            }
        }

        // eg. if "-0" and 5 is input, do "-5"
        else if(this.getText().equals("-0") && !s.equals(".")){
            this.setText("-"+ s);
        }   
        
        // eg. if "0" and 5 is input, do "5"
        else if(this.getText().equals("0") && !s.equals(".")){
            this.setText(s);
        }

        // eg. if "0.34" and "." is input, don't do anything
        // eg. if "0.34" and "5" is input, do "0.345"
        else if(!(s.equals(".") && this.getText().contains("."))){
            this.setText(this.getText() + s);
        }
    }

    /**
     * Hard reset, usually after clears.
     */
    public void resetText(){
        this.setText("0");
    }

    /**
     * Gets the 'isReadyToReset' bit attached to this class.
     * This bit is needed to display the result of an '=', but
     * is not ready to clear the text (because the user wants to
     * actually see the answer!)
     * @return
     */
    public boolean getIsReadyToReset(){
        return this.isReadyToReset;
    }

    public void setIsReadyToReset(boolean b){
        this.isReadyToReset = b;
    }
}
