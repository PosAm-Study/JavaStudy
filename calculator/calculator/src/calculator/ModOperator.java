package calculator;

public class ModOperator implements Operator {
    @Override
    public int calculate(int leftNum, int rightNum) {
        return leftNum % rightNum;
    }
}
