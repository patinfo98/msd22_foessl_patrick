package at.fhj.msd;

public class Calculator {


    public double add(double number1, double number2){
        return number1+number2;
    }
    public double minus(double number1, double number2){
        return number1-number2;
    }
    public double divide(double number1, double number2){
        if(number2 == 0){
            throw new ArithmeticException();
        }
        return number1/number2;
    }
    public double multiply(double number1, double number2){
        return number1*number2;
    }

    public double faculty(int x){
        int faculty = 1;
        if(x<0)
            return 0;
        for(int j = 1; j<=x; j++){
            faculty*=j;
        }
        return faculty;
    }
}
