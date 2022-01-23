package ui.panels;

import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.*;
import controller.CalcController;
import listeners.NumeralListener;
import listeners.OpListener;

public class ButtonPanel extends JPanel{
    TextPanel textPanel;
    CalcController calcController;
    public ButtonPanel(TextPanel textPanel, CalcController calcController){
        this.textPanel = textPanel;
        this.calcController = calcController;
        this.setLayout(new GridBagLayout());
        this.add(this.addNumerals());
        this.add(this.addOps());
    }

    /**
     * Add numberpad to the panel. Add the same listener, and therefore the same
     * calcController to each button so that there are no overrides. 
     * @return
     */
    private JPanel addNumerals() {
        JPanel numeralPanel = new JPanel();
        numeralPanel.setLayout(new GridLayout(4, 3));
        NumeralListener numeralListener = new NumeralListener(this.textPanel);
        String buttonOrder = "789456123.0~";

        for(int i = 0; i < buttonOrder.length(); i++){
            String characterNum = buttonOrder.substring(i, i+1);
            JButton b = new JButton(characterNum);
            if(characterNum.equals("~")){
                b.setText("+/-");
            }
            b.addActionListener(numeralListener);
            numeralPanel.add(b);            
        }

        return numeralPanel;
    }

    /**
     * Add the operations and '=' to the button panel.
     * 
     * The equals sign acts very much like an operator so it will
     * get the same listener.
     * @return
     */
    private JPanel addOps() {
        JPanel opsPanel = new JPanel();
        opsPanel.setLayout(new GridLayout(5, 1));
        String buttonOrder = "+-*/=";
        OpListener opListener = new OpListener(textPanel, this.calcController);

        for(int i = 0; i < buttonOrder.length(); i++){
            String characterNum = buttonOrder.substring(i, i+1);
            JButton b = new JButton(characterNum);
            b.addActionListener(opListener);
            opsPanel.add(b);            
        }
        return opsPanel;
    }
    
}
