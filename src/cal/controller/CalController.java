package cal.controller;

import cal.domain.Cal;
import cal.exception.CalCharException;
import cal.service.CalService;
import cal.util.CalUtil;

public class CalController {

    private final CalService calService;
    private final CalUtil calUtil;

    public CalController(CalService calService) {
        this.calService = calService;
        this.calUtil = new CalUtil();
    }

    public void start() {
        while (true) {
            try {
                Cal cal = mainController();
                double result = 0;
                result = operating(cal);
                if (isInteger(result)) {
                    System.out.println("답: " + (int) result);
                } else {
                    System.out.println("답: " + result);
                }
            } catch (CalCharException e) {
                System.out.println(e.getMessage());
                continue;
            } catch (Exception e) {
                System.out.println("종료합니다.");
                return;
            }
        }
    }

    private double operating(Cal cal) throws CalCharException {
        if (cal.getOper() == '+') {
            return calService.plus(cal.getN1(), cal.getN2());
        } else if (cal.getOper() == '-') {
            return calService.minus(cal.getN1(), cal.getN2());
        } else if (cal.getOper() == '*') {
            return calService.multiply(cal.getN1(), cal.getN2());
        } else if (cal.getOper() == '/') {
            return calService.divide(cal.getN1(), cal.getN2());
        } else if (cal.getOper() == '%') {
            return calService.remainder(cal.getN1(), cal.getN2());
        } else {
            throw new CalCharException();
        }
    }

    private Cal mainController() {
        System.out.println("----------계산기----------");
        System.out.print("첫 번째 값: ");
        double n1 = calUtil.scanDouble();
        System.out.print("연산자: ");
        char oper = calUtil.scanOper();
        System.out.print("두 번째 값: ");
        double n2 = calUtil.scanDouble();

        return new Cal(n1, oper, n2);
    }

    public boolean isInteger(double num) {
        return num == (int) num;
    }
}
