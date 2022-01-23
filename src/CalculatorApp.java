import controller.CalcController;
import ui.CalcFrame;

public class CalculatorApp {

    /**
     * Constructor for the calculator app.
     * 
     * Trying to separate the controller (backend) from the UI (frontend) as
     * much as possible. 
     */
    public CalculatorApp() {
        CalcController calcController = new CalcController();
        new CalcFrame(calcController);
    }
    
    public static void main(String[] args) throws Exception {
        new CalculatorApp();
    }
}
