package cal.util;

import java.util.Scanner;

public class CalUtil {
    public double scanDouble() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    public char scanOper() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next().charAt(0);
    }
}
