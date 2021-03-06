package arrays;

import java.util.Scanner;

public class summerDiogonalt4x4 {

	public static void main(String[] args) {
		double[][] matrix = createMatrix();
		printMatrix(matrix);
		System.out.println("The sum of the diogonal is: " + sumDiogonal(matrix));
	}

	//denne metoden fungerer bare for m x m
	public static double sumDiogonal(double[][]matrix){
		double total=0;
		for(int row = 0; row<matrix.length; row++){
			total += matrix[row][row];
		}
		return total;
	}
	public static double [][] createMatrix(){
		Scanner scan = new Scanner(System.in);
		double[][] matrix = new double [4][4];
		
		System.out.println("Enter " + matrix.length + " rows and " + matrix[0].length + " columns: ");
		
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				matrix[row][column] = scan.nextInt();
			}
		}
		return matrix;
	}
	public static void printMatrix(double [][] matrix){
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				System.out.print(matrix[row][column] + " ");
			}
			System.out.println();
		}
	}
	
}