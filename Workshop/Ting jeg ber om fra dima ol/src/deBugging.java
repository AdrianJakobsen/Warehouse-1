
public class deBugging {


	public static void main(String[] args) {

		// start oppdrag 1

	                //1. les feilmeldinger og fiks f�lgende deklarasjon
	                char[] charArray = new char[] { 'c', 'y', 'k', 'a', };
	                System.out.println(charArray);
		 

		//	 start oppdrag 2

	                //2. bruk breakpoint for � lese verdien til de forskjellige charArrToString
	                //en av disse har ulovlig syntaks, hvorfor forklares i feilmeldingen. slett den f�r du starter programmet.
	                //stopp programmet n�r du har funnet den rette m�ten � gj�re char[] til String, og print den ut

	                //NB! breakpoints stopper debuggeren like f�r linja breakpointen st�r p� er evaluert, ikke etter
	                //du vil f.eks. kunne lese verdien til charArrayAsString1 om du setter breakpoint p� linje 17, men ikke p� l. 16
	               
	                String charArrayAsString2 = String.valueOf(charArray); // hold musa over valueOf-metoden for � lese hva den gj�r
	                String charArrayAsString3 = new String(charArray);
	                


	                System.out.println(charArrayAsString2);
	                System.out.println(charArrayAsString3);

		

		// start oppdrag 3

	                //3. Bruk breakpoint til � kontrollere at halvedAge er faktisk halvparten av 21 f�r du printer tallet ut.
	                int age = 21;
	                double halvedAge = 21.0/2; //tror du mente � skrive age her, og s� f� meg til endre int til double eller legge til (double) i halvage

	                System.out.println(halvedAge);

		 

		// start oppdrag 4

	                // 4. Her er en feil i logikken, hvorfor?
	                // hva m� gj�res for � skrive ut "halved age is correct!" n�r det er sant uten � f� en exception?
	                //svar mitt, den er plassert utenfor sitt "hjem", kommer ikke p� hva det heter
	                String isHalvedAgeFixed;
	                if (halvedAge != 10) {
	                        isHalvedAgeFixed = "halved age is correct!";
	                System.out.println(isHalvedAgeFixed); 
	                }
	               

		

		// start oppdrag 5
	                //5. Denne beregninger best�r av mange feil, og alle feilmeldingene er ikke tilgjendelige. Du m� l�se alle feilene.
	                //tips: legg ulike delene av beregningen i egne variabler slik at du kan lese dem med breakpoints
	                //f eks: double pow1 = Math.pow(5,2);
	                double pow = Math.pow(5,2);
	                double aFloat = 2.001f+5;
	                double sqrt = Math.sqrt(4);
	                //int wtfIsDis = Math.pow(5,2)*2.001f+5*Math.sqrt('4');
	                int wtfIsDis = (int) (pow*aFloat*sqrt);
	                System.out.println(wtfIsDis);
	                //s�nn her?
		 

		// start oppdrag 6
	                // noe er feil i funksjonen isNumberThree, finn feilmeldingen og korriger logikken
	                if (!isNumberThree(6)) {
	                        System.out.println("The number is not three!");
	                } else {
	                        System.out.println("The number is three!");
	                }
		 
	}

	// del av oppdrag 6
	        private static boolean isNumberThree(int number) {
	                boolean istru;

	                switch (number) {
	                        case 3: istru = true;
	                        default: istru = false;
	                }

	                return istru;
	        }
	
}

