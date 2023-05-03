package calculator;

public class DivOperator implements Operator {
    @Override
    public int calculate(int leftNum, int rightNum) {
        return leftNum / rightNum;
    }
}
