package org.example.cal;

import org.example.domain.Operator;

public interface Calc {
    double calculate(double num1,double num2);
    boolean isOperator(Operator operator);
}
