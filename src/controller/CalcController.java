package controller;

public class CalcController {
    private double register1 = 0;
    private double register2 = 0;
    private String operator = "";
    private boolean goToSecondReg = false;
    private boolean previousCharWasEquals = false;

    /**
     * deterines if the first registration was already populated
     * @return
     */
    public boolean isFirstRegPopulated(){
        return this.goToSecondReg;
    }

    /**
     * gets if previous operation inputted into the calc was '='
     * @return
     */
    public boolean getPreviousCharWasEquals(){
        return this.previousCharWasEquals;
    }

    /**
     * sets if previous operation inputted into the calc was '='
     * @param b
     */
    public void setPreviousCharWasEquals(boolean b){
        this.previousCharWasEquals = b;
    }

    /**
     * gets the first register
     * @return
     */
    public double getReg1(){
        return this.register1;
    }

    /**
     * sets the first register
     * @param s - string to set onto first register
     */
    public void setReg1(String s){
        this.register1 = Double.parseDouble(s);
        goToSecondReg = true;
    }

    /**
     * gets the second register
     * @return
     */
    public double getReg2(){
        return this.register2;
    }

    /**
     * sets the second register
     * @param s - string to set onto second register
     */
    public void setReg2(String s){
        this.register2 = Double.parseDouble(s);
    }

    /**
     * gets the operation to be performed
     * @return
     */
    public String getOp(){
        return this.operator;
    }

    /**
     * sets the operation to be performed
     * @param s - the incoming operation
     */
    public void setOp(String s){
        this.operator = s;
        this.setPreviousCharWasEquals(false);
    }

    /**
     * Performs the operation on the two registers.
     * Defaults to simply returning the first register.
     * 
     * Stores the result into the first register for
     * future operations.
     * @return
     */
    public double performOperation(){
        switch(operator){
            case "+":
                register1 = register1 + register2;
                break;
            case "-":
                register1 = register1 - register2;
                break;
            case "*":
                register1 = register1 * register2;
                break;
            case "/":
                register1 = register1 / register2;
                break;
            default:
                return register1;
        }
        return register1;
    }

    /**
     * Resets all registers and operation logic.
     * 
     * Attached to the ClearAll button.
     */
    public void resetAll(){
        this.register1 = 0;
        this.register2 = 0;
        this.operator = "";
        this.goToSecondReg = false;
        this.previousCharWasEquals = false;
    }
}
