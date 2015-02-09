package oppgave12_11;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import org.junit.Test;

public class TestRemoveWord {

	@Test
	public void check_createFile() throws IOException {
		File myFile = new File("testFile.txt");
		assertTrue(myFile.exists());
	}
	@Test
	public void check_IfFileContainsAWord() throws IOException {
		File myFile = new File("testFile.txt");
		removeWord file = new removeWord();
		assertTrue(file.checkForAWord("Per"));
	}

	//		@Test
	//		public void check_


}