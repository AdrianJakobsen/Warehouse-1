package ioblig1;

import java.util.Random;

import dimclasses.*;
import dimclasses.Dimath.Physics.BMI.BmiType;

public class Oppgaver {	
	public static void main(String[] args) {
		
		// oppgave 1
		double radius = 10;
		double height = 5;
		double area = Dimath.Geometry.Cylinder.getArea(radius);
		double volume = Dimath.Geometry.Cylinder.getVolume(radius, height);
		
		// oppgave 2
		double pounds = 10;
		double kilos = Dimath.Physics.Pounds.toKilograms(pounds);
		
		// oppgave 3
		int number = 456789;
		int result = Dimath.Numbers.sumDigits(number);
		
		// oppgave 4
		double myWeight = 85;
		double myHeight = 1.85;
		double myBmi = Dimath.Physics.BMI.getBmi(myWeight, myHeight);
		
		// oppgave 5 
		double length = 5.5;
		double hex_area = Dimath.Geometry.Hexagon.getArea(length);
		
		
		// oppgave 7
		String[] months = new String[]{
				"September",
				"October",
				"November",
				"December",
				"January",
				"February",
				"March",
				"April",
				"May",
				"June",
				"July",
				"August"
			};
		String randmonth = months[(new Random()).nextInt(months.length)];
		
		// oppgave 8
		BmiType myBmitype = Dimath.Physics.BMI.getType(myBmi);
		
		// oppgave 9
		int unumber = 216138127;
		int[] ascsorted = Dimath.Numbers.sortDigits(unumber, false);
		int[] descsorted = Dimath.Numbers.sortDigits(unumber, true);
		
		System.out.println();
	}
}