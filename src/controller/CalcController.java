package controller;

public class CalcController {
    private double register1 = 0;
    private double register2 = 0;
    private String operator = "";
    private boolean goToSecondReg = false;
    private boolean previousCharWasEquals = false;

    public boolean isFirstRegPopulated(){
        return this.goToSecondReg;
    }

    public void setPreviousCharWasEquals(boolean b){
        this.previousCharWasEquals = b;
    }

    public boolean getPreviousCharWasEquals(){
        return this.previousCharWasEquals;
    }

    public double getReg1(){
        return this.register1;
    }

    public void setReg1(String s){
        this.register1 = Double.parseDouble(s);
        goToSecondReg = true;
    }

    public double getReg2(){
        return this.register2;
    }

    public void setReg2(String s){
        this.register2 = Double.parseDouble(s);
    }

    public String getOp(){
        return this.operator;
    }

    public void setOp(String s){
        this.operator = s;
        this.setPreviousCharWasEquals(false);
    }

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

    public void resetAll(){
        this.register1 = 0;
        this.register2 = 0;
        this.operator = "";
        this.goToSecondReg = false;
        this.previousCharWasEquals = false;
    }
}
