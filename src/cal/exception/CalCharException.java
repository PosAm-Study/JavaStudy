package cal.exception;

public class CalCharException extends CalException{
    public static final String message = "잘못 입력하셨습니다.";

    public CalCharException(){
        super(message);
    }
}
