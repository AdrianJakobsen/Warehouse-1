package oppgave4;

import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

import javax.xml.stream.events.Characters;

public class ReadFromFile {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		TreeMap<Character, Integer> TM = new TreeMap<Character, Integer>();
		//		System.out.println("Working Directory = " +
		//				System.getProperty("user.dir"));
		while(true){
			System.out.println("Please enter the name of the txt file you want: ");
			String fileNameInput = input.next(); 
			java.io.File file = new java.io.File(fileNameInput+".txt");
			Scanner scanFile = null;

			try {
				scanFile = new Scanner(file);
				while(scanFile.hasNext()){
					char[] fileAsCharArray = scanFile.nextLine().toUpperCase().toCharArray();
					for(Character temp : fileAsCharArray){
						if(temp == ' '){
							continue;
						}
						else if(TM.containsKey(temp)){
							TM.put(temp, TM.get(temp)+1);
						}else {
							TM.put(temp, 1);
						}
					}
				}
			} catch (FileNotFoundException e) {
				System.out.println("404 file not found!!!");			
			} 
			for(Entry<Character, Integer> entry : TM.entrySet()){
				System.out.println(entry.getKey() + ": " + entry.getValue());
			}
		}
	}
}