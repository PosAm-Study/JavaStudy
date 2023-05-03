package org.example.view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputView {
    private final static Scanner sc = new Scanner(System.in);
    private final static String INPUT_NUM1 = "첫번째 숫자를 입력해주십시오";
    private final static String INPUT_NUM2 = "두번째 숫자를 입력해주십시오";
    private final static String INPUT_OPERATOR = "연산자를 입력해주십시오(+,-,*,/)";
    private final static String INPUT_IS_FINISH = "계산을 더하시겠습니까?(더하시려면 1번 아니면 0번을 눌러주세요)";
    private final static String ERROR_NOT_DOUBLE = "실수가 아닙니다 다시 입력해주세요.";
    private final static String ERROR_NOT_MESSAGE="문자열이 아닙니다 다시 입력해주세요.";
    public static double inputNum1() {
        System.out.println(INPUT_NUM1);
        return getInputDouble();
    }
    public static String inputOperator() {
        System.out.println(INPUT_OPERATOR);
        return getInputOperator();
    }
    public static double inputNum2() {
        System.out.println(INPUT_NUM2);
        return getInputDouble();
    }
    private static double getInputDouble() {
        try {
            return sc.nextDouble();
        } catch (InputMismatchException exception) {
            System.out.println(ERROR_NOT_DOUBLE);
            return getInputDouble();
        }
    }

    private static String getInputOperator() {
        try {
            return sc.next();
        } catch (IllegalArgumentException e) {
            System.out.println(ERROR_NOT_MESSAGE);
            return getInputOperator();
        }
    }
}
