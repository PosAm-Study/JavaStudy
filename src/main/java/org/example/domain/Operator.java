package org.example.domain;

import java.util.Arrays;

public enum Operator {
    PLUS("+"),
    MINUS("-"),
    MULTIPLY("*"),
    DIVIDE("/"),
    REMAIN("%");

    private String operator;

    Operator(String operator) {
        this.operator = operator;
    }

    public static Operator getOperator(String s){
        Operator[] values = Operator.values();
        return Arrays.stream(values).filter(
                o -> o.operator.equals(s))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }

    @Override
    public String toString() {
        return operator;
    }
}
