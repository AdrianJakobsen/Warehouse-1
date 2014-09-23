import java.util.Random;


public class RandMonth {

	public static void main(String[] args) {
		Random rand = new Random();

		/*String[] months;
		months = new String[12];
		months[0] = "january";
		months[1] = "febuary";
		months[2] = "march";
		months[3] = "april";
		months[4] = "may";
		months[5] = "june";
		months[6] =  "july"; 
		months[7] = "august";
		months[8] = "september";
		months[9] = "october";
		months[10] = "november";
		months[11] = "december";
		*/ // min måte under er dimas, mye lettere
		
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

		int arrayNumber = rand.nextInt(months.length); //month.length blir lengden av stringen over
														//den henter antall elementer i arryen


		System.out.println("The month is " + months[arrayNumber]);

	}

}
