import org.apache.logging.log4j.LogManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.imageio.IIOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calc {
    private static final Logger logger = LoggerFactory.getLogger(Calc.class);
    private   static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IIOException {
        int i = sc.nextInt();
        logger.info("Enter number : " + i);
        int j =sc.nextInt();
        logger.info("Enter number 2 :" + j);
        System.out.println("Enter a char :" );
        String k = sc.next();
        logger.info("Entered char: "+k);
        int res = 0;
        switch (k){
            case "+":
                res = i + j;
                break;
            case "-":
                res = i - j;
                break;
            case "*":
                res = i * j;
                break;
            case "/":
                if (j == 0) {
                    logger.info("can't divide by zero");
                    i = 0;
                }else {
                    res = i / j;
                }
                break;

        }
        logger.debug("result" + res);
        System.out.println(res);
        }
    }

