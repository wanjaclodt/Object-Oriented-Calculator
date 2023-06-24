// 1. Create a Calculator class.
public class Calculator {
    // 2. Declare instance variables.

    private double operandOne;
    private double operandTwo;
    private String operator;

    private double result;

    // 3. Define a constructor.

    public Calculator() {

    }

    // 4. Define setter and getter methods.

    public double getOperandOne() {
        return operandOne;
    }

    public void setOperandOne(double newOperandOne) {
        this.operandOne = newOperandOne;
    }

    public double getOperandTwo() {
        return operandTwo;
    }

    public void setOperandTwo(double newOperandTwo) {
        this.operandTwo = newOperandTwo;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String newOperator) {
        this.operator = newOperator;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double newResult) {
        this.result = newResult;
    }

    // 5. Define a method to perform the calculation based on the operator.

    public void performCalculation() {

        switch (operator) {
            case "+" -> result = operandOne + operandTwo;
            case "-" -> result = operandOne - operandTwo;
            case "/" -> result = operandOne / operandTwo;
            case "*" -> result = operandOne * operandTwo;
            default -> {
                System.out.println("False Operator.");
                return;
            }
        }
    }
}
