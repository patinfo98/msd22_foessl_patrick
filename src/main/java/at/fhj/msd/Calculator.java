package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.invoke.MethodHandles;
import java.lang.reflect.Method;

public class Calculator {
    private static Logger logger = LogManager.getLogger();

    public double add(double number1, double number2){
        logger.debug("method " + Thread.currentThread().getStackTrace()[1].getMethodName() + " called with parameters " + "number1: " + number1 + ", " + "number2: " + number2);
        return number1+number2;
    }
    public double minus(double number1, double number2){
        logger.debug("method " + Thread.currentThread().getStackTrace()[1].getMethodName() + " called with parameters " + "number1: " + number1 + ", " + "number2: " + number2);

        return number1-number2;
    }
    public double divide(double number1, double number2){
        logger.debug("method " + Thread.currentThread().getStackTrace()[1].getMethodName() + " called with parameters  " + "number1: " + number1 + ", " + "number2: " + number2);

        if(number2 == 0){
            logger.error("Division by 0");
            throw new ArithmeticException();
        }
        return number1/number2;
    }
    public double multiply(double number1, double number2){
        logger.debug("method " + Thread.currentThread().getStackTrace()[1].getMethodName() + " called with parameters " + "number1: " + number1 + ", " + "number2: " + number2);

        return number1*number2;
    }

    public double faculty(int x){
        logger.debug("method " + Thread.currentThread().getStackTrace()[1].getMethodName() + " called with parameters " + "int: " + x);

        int faculty = 1;
        if(x<0)
            return 0;
        for(int j = 1; j<=x; j++){
            faculty*=j;
        }
        return faculty;
    }
}
