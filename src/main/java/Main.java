import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str = UserInput.getNumbers();
        int len = str.length();

        for(int i=0;i<len;i++){
            char c = str.charAt(i);

            if (c != '+' && c != '-' && c != '*' && c != '/') {
                continue;
            }

            int arr[] = Calc.splitNumber(str,i);
            int first = arr[0];
            int second = arr[1];

            int result = 0;
            if(c=='+'){
                result = first+second;
            }
            else if(c=='-'){
                result = first-second;
            }
            else if(c=='*'){
                result = first*second;
            }
            else if(c=='/'){
                result = first/second;
            }

            System.out.println(result);
        }
    }
}