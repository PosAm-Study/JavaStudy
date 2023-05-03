package calculator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class OperatorFactory {
    Map<String, Operator> stringOperatorMap = new HashMap<>();
    Operator createOperator(String operatorString) {
        if (!stringOperatorMap.containsKey(operatorString)) {
            switch (operatorString) {
                case "+":
                    stringOperatorMap.put(operatorString, new AddOperator());
                    break;

                case "-":
                    stringOperatorMap.put(operatorString, new SubOperator());
                    break;

                case "*":
                    stringOperatorMap.put(operatorString, new MulOperator());
                    break;

                case "/":
                    stringOperatorMap.put(operatorString, new DivOperator());
                    break;

                case "%":
                    stringOperatorMap.put(operatorString, new ModOperator());
                    break;

                default:
                    throw new RuntimeException("Error");
            }
        }
        return stringOperatorMap.get(operatorString);
    }
}
