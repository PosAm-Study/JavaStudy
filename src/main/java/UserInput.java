import java.util.Scanner;

public class UserInput {
    public static String getNumbers () {
        System.out.println("계산식을 입력해주세요 : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        return str;
    }
}
