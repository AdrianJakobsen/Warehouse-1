package arrays;

import java.util.Scanner;

public class dimosjonal2Array {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double [][] matrix = new double [3][4];
		System.out.println("Enter " + matrix.length + " rows and " + matrix[0].length + " columns: ");

		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				matrix[row][column] = scanner.nextInt();
			}
		}
		int columIndex;
		System.out.println("Enter the colum index:");
		columIndex = scanner.nextInt();

		System.out.println("The sum of the coulum " + columIndex + " is " + sumColumn(matrix, columIndex));
	}
	public static double sumColumn(double[][] matrix, int columnIndex){
		double total = 0;
		for(int row = 0; row < matrix[columnIndex].length; row++)
			total += matrix[columnIndex][row];
		return total;
	}
}



