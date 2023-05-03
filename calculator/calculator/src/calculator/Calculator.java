package calculator;

public class Calculator {
    static final OperatorFactory operatorFactory = new OperatorFactory();
    public static int calculate(int leftNum, String operatorString, int rightNum) {
        return operatorFactory.createOperator(operatorString).calculate(leftNum, rightNum);
    }
}
