package calculator;

public class AddOperator implements Operator {
    @Override
    public int calculate(int leftNum, int rightNum) {
        return leftNum + rightNum;
    }
}
