package dimclasses;

import java.util.Arrays;

public class Dimath {
	
	// GEOMETRY
	public static class Geometry {
		public static class Cylinder {
			public static double getArea(double radius) {
				return Math.pow(radius, 2)*Math.PI;
			}
			
			public static double getVolume(double radius, double height) {
				return getArea(radius)*height;
			}
		}
		
		public static class Hexagon {
			public static double getArea(double length) {
				return (3*Math.sqrt(3)/2)*Math.pow(length, 2);
			}
		}
	}
	
	// CONVERSION
	public static class Physics {
		public static class Pounds {
			public static final double kgRatio = 0.454;
			
			public static double toKilograms(double amount) {
				return amount * kgRatio;
			}
		}
		
		public static class BMI {
			public enum BmiType { Undervektig, Normal, Overvektig, Fedme };

			/**
			 * @param height in metres
			 */
			public static double getBmi(double kg, double height) {
				return kg/Math.pow(height, 2);
			}
			
			public static BmiType getType(double bmiIndex) {
				if (bmiIndex > 30)
					return BmiType.Fedme;
				else  if (bmiIndex < 18.5)
					return BmiType.Undervektig;
				else if (bmiIndex < 25)
					return BmiType.Normal;
				else 
					return BmiType.Overvektig;
			}
			
			public static BmiType getType(double kg, double height) {
				return getType(getBmi(kg, height));
			}
		}
	}
	
	// NUMBERS
	public static class Numbers {
		public static int sumDigits(int number) {
			int result = 0;
			
			while (number > 0) {
				result += number % 10;
				number /= 10;
			}
			
			return result;
		}
		
		public static int[] sortDigits(int number, boolean desc) {
			char[] numbers = Integer.toString(number).toCharArray();
			int[] result = new int[numbers.length];
			
			for (int i = 0; i < numbers.length; i++) {
				result[i] = numbers[i] - '0';
			}
			
			Arrays.sort(result); // asc
			
			if (desc) {
				int[] temp = result;
				int j = 0;
				for (int i = temp.length-1; i >= 0; i--) {
					result[j] = temp[i];
					j++;
				}
			}
			
			return result;
		}
	}
}
