package Gockenbach.Jack.Chapter6.Java;

public class SimpleMath {
	
	public double divide(double numerator, double denomenator) {
		if(denomenator == 0) {
			throw new ArithmeticException("Cannot divide by 0");
		}
		double result = numerator/denomenator;
		
		return result;
	}
	public double multiply(double number1, double number2) {
		double result = number1*number2;
		return result;
	}

}
