package ui.panels;

import javax.swing.JButton;
import javax.swing.JPanel;

import listeners.NumeralListener;

import java.awt.*;

public class ButtonPanel extends JPanel{
    TextPanel textPanel;
    public ButtonPanel(TextPanel textPanel){
        this.textPanel = textPanel;
        this.setLayout(new GridBagLayout());
        this.add(this.addNumerals());
        this.add(this.addOps());
    }

    //TODO
    private JPanel addNumerals() {
        JPanel numeralPanel = new JPanel();
        numeralPanel.setLayout(new GridLayout(4, 3));
        NumeralListener numeralListener = new NumeralListener(this.textPanel);
        String buttonOrder = "789456123~0~";

        for(int i = 0; i < buttonOrder.length(); i++){
            String characterNum = buttonOrder.substring(i, i+1);
            JButton b = new JButton(characterNum);
            if(characterNum.equals("~")){
                b.setEnabled(false);
            }
            b.addActionListener(numeralListener);
            numeralPanel.add(b);            
        }

        return numeralPanel;
    }

    private JPanel addOps() {
        JPanel opsPanel = new JPanel();
        opsPanel.setLayout(new GridLayout(5, 1));
        String buttonOrder = "+-*/=";

        for(int i = 0; i < buttonOrder.length(); i++){
            String characterNum = buttonOrder.substring(i, i+1);
            JButton b = new JButton(characterNum);
            opsPanel.add(b);            
        }

        return opsPanel;
    }
    
}
