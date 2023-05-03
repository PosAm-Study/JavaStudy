package calculator;

public class MulOperator implements Operator {
    @Override
    public int calculate(int leftNum, int rightNum) {
        return leftNum * rightNum;
    }
}
