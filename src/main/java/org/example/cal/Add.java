package org.example.cal;

import org.example.domain.Operator;

public class Add implements Calc{
    @Override
    public double calculate(double num1, double num2) {
       return num1 +num2;
    }

    @Override
    public boolean isOperator(Operator operator) {
       return operator==Operator.PLUS;
    }
}
