package ui.panels;

import javax.swing.JPanel;

import java.awt.*;

public class ButtonPanel extends JPanel{
    public ButtonPanel(){
        this.setLayout(new GridLayout(2, 1));
        this.add(this.addNumerals());
    }

    //TODO
    private JPanel addNumerals() {
        JPanel numeralPanel = new JPanel();
        numeralPanel.setLayout(new GridLayout(3, 4));
        return numeralPanel;

    }
    
}
