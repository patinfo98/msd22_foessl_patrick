package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static Logger logger = LogManager.getLogger();
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        logger.info("Info Log");
        calculator.add(1,1);
        calculator.minus(1,1);
        calculator.multiply(1,1);
        calculator.divide(1,1);
        logger.error("Error Log");




    }
}
