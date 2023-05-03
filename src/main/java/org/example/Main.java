package org.example;

import org.example.domain.Operator;

import static org.example.view.InputView.*;

public class Main {
    public static void main(String[] args){
        Calculate instance = Calculate.getInstance();
        double v = instance.startCalculate(inputNum1(), Operator.getOperator(inputOperator()), inputNum2());
        System.out.println(v);
    }

}