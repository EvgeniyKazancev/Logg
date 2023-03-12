import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Logger_Test {
    private static final Logger logger = LoggerFactory.getLogger(Logger_Test.class);

    public static void main(String[] args) {
        logger.info("Test log from {}", Logger_Test.class.getSimpleName());
    }
}
