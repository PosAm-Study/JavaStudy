package org.example;

import org.example.cal.*;
import org.example.domain.Operator;

import java.util.List;

public class Calculate {
    private final static Calculate calculate = new Calculate();
    private Calculate() {
    }
    public static Calculate getInstance() {
        return calculate;
    }

    public double startCalculate(final double num1,final Operator operator,final double num2) {
        List<Calc> arr = List.of(new Add(), new Divide(),new Minus(),new Multiply(),new Remain());
        Calc calc = arr.stream().filter(o -> o.isOperator(operator)).findAny().get();
        return calc.calculate(num1, num2);
    }

}
