package calculator;

public class SubOperator implements Operator {
    @Override
    public int calculate(int leftNum, int rightNum) {
        return leftNum - rightNum;
    }
}
