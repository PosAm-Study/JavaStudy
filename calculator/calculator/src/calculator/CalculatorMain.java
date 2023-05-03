package calculator;


import java.io.InputStreamReader;
import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(new InputStreamReader(System.in));
        System.out.println("Do you need Calculator? (y or any key)");
        while (scanner.nextLine().equals("y")) {
            System.out.println(Calculator.calculate(scanner.nextInt(), scanner.next(), scanner.nextInt()));
            scanner.nextLine();
            System.out.println("Need more calculate? (y or any key)");
        }
    }
}
