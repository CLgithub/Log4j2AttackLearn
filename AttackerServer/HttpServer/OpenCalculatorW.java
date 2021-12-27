import java.io.IOException;

public class OpenCalculatorW  {

    static {
        Process p;
        String[] cmd = {"calc"};
        try {
            p = Runtime.getRuntime().exec(cmd);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}