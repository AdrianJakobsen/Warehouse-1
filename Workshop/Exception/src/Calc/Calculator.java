package Calc;

public class Calculator {

	public Calculator(){

	}

	public int divide(int firstNumber, int secondNumber) throws ArithmeticException{
		if (secondNumber ==0){
			throw new ArithmeticException("Ooops! Division can not be zero!");
		}else{
			return firstNumber/secondNumber;
		}		
	}
}