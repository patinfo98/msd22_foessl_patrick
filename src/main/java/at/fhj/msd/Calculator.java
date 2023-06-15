/**
 * Calculator is a class with methods for basic arithmetic calculations
 *
 * The class contains methods to add, subtract, multiply, divide numbers
 * from each other, as well as to calculate the factorial of a number. It
 * further saves the execution of methods in a log file.
 *
 * @author Patrick Foessl
 *
 * */
package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class Calculator {

    /**
     * a logger to help with debugging
     *  */
    private static Logger logger = LogManager.getLogger();

    /**
     * The method adds two numbers together
     *
     * The method call is logged to a file before the sum of two numbers is returned
     *
     * @param number1 is the first number
     * @param number2 is the second number
     * @return the sum of the numbers
     *
     *
     * */
    public double add(double number1, double number2){
        logger.debug("method " + Thread.currentThread().getStackTrace()[1].getMethodName() + " called with parameters " + "number1: " + number1 + ", " + "number2: " + number2);
        return number1+number2;
    }

    /**
     * The method subtracts one number from another
     *
     * The method call is logged to a file before the result is returned
     *
     * @param number1 is the first number
     * @param number2 is subtracted from number1
     * @return number1 - number2
     *
     * */
    public double minus(double number1, double number2){
        logger.debug("method " + Thread.currentThread().getStackTrace()[1].getMethodName() + " called with parameters " + "number1: " + number1 + ", " + "number2: " + number2);

        return number1-number2;
    }

    /**
     * The method divides one number from another
     *
     * The method call is logged to a file before the result is returned
     * @param number1 is the numerator
     * @param number2 is the denominator
     * @return number1 divided by number2
     * @throws ArithmeticException if division by zero is tried
     * */
    public double divide(double number1, double number2){
        logger.debug("method " + Thread.currentThread().getStackTrace()[1].getMethodName() + " called with parameters  " + "number1: " + number1 + ", " + "number2: " + number2);

        if(number2 == 0){
            logger.error("Division by 0");
            throw new ArithmeticException();
        }
        return number1/number2;
    }

    /**
     * The method multiplies two numbers
     *
     * The method call is logged to a file before the result is returned
     * @param number1 is the first number
     * @param number2 is the second number
     * @return the product of the numbers
     * */
    public double multiply(double number1, double number2){
        logger.debug("method " + Thread.currentThread().getStackTrace()[1].getMethodName() + " called with parameters " + "number1: " + number1 + ", " + "number2: " + number2);

        return number1*number2;
    }

    /**
     * The method calculates the factorial of a given number
     *
     * factorial is the multiplication of each number up to the given number
     * e.g. factorial of 5 = 1*2*3*4*5
     * The method call is logged to a file before the result is returned
     * @param number1 is the first number
     * @param number2 is the second number
     * @return the product of the numbers
     * */
    public double factorial(int x){
        logger.debug("method " + Thread.currentThread().getStackTrace()[1].getMethodName() + " called with parameters " + "int: " + x);

        int factorial = 1;
        if(x<0)
            return 0;
        for(int j = 1; j<=x; j++){
            factorial*=j;
        }
        return factorial;
    }
}
