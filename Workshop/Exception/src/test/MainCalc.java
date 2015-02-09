package test;

import java.util.InputMismatchException;
import java.util.Scanner;

import Calc.Calculator;

public class MainCalc {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		Scanner input = new Scanner(System.in);
		while(true){
			try {
				System.out.println("input divident");
				int firstNumber = input.nextInt();
				System.out.println("input divisor");
				int secondNumber = input.nextInt();
				int result = calc.divide(firstNumber, secondNumber);
				System.out.println("Result: " +result);
			} catch (ArithmeticException e) {
				System.out.println(e.getMessage());
			}
			catch(InputMismatchException e){
				System.out.println("Input must be an integer");
				input.nextLine();
			}
			catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
	}
}
