import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.Scanner;

public class fileTestMain {
	public static void main(String[] args) throws IOException {
		File myFile = new File("test.txt");
		if(!myFile.exists());{
			myFile.createNewFile(); 
		}
		
//		System.out.println(myFile.getAbsolutePath());
//		System.out.println(myFile.length());
		
		try(PrintWriter output = new PrintWriter(myFile);){
		output.print("Hello");
		output.println(" all");
		output.println("this is fun!!");
		output.close();  	
		}
		
		try(Scanner input = new Scanner(myFile);){
			String text = input.nextLine();
			//System.out.println(text);
		}
		
		URL url = new URL("http://cs.armstrong.edu/liang/data/Lincoln.txt");
		try(Scanner input = new Scanner(url.openStream())){
			String text = input.nextLine();
			System.out.println(text);
		}
		//pwd();
	}
	
	private static void pwd(){
		System.out.println("Working Directory = " +
							System.getProperty("user.dir"));
	}
}