import java.util.Scanner;

public class Calc {
    public static int[] splitNumber(String str, int num){
        int a = Integer.parseInt(str.substring(0,num));
        int b = Integer.parseInt(str.substring(num,str.length()));

        return new int[]{a, b};
    }
}
