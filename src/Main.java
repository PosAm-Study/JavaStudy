import cal.controller.CalController;
import cal.service.CalServiceImpl;
import cal.util.CalUtil;

public class Main {
    public static void main(String[] args) {
        CalController calController = new CalController(new CalServiceImpl());
        calController.start();
    }
}